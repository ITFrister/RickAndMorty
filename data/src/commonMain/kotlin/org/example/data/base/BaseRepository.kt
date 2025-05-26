package org.example.data.base

import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.request
import io.ktor.http.isSuccess
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.io.IOException
import kotlinx.serialization.SerializationException
import org.example.core.utils.AppCoroutineDispatchers
import org.example.domain.utils.Either
import org.example.domain.utils.NetworkError

abstract class BaseRepository {
    protected inline fun <reified T : Any, S : Any> doRequest(
        crossinline request: suspend () -> HttpResponse,
        crossinline mapper: (T) -> S
    ): Flow<Either<NetworkError, S>> = flow {
        try {
            val response = request()
            val code = response.status.value

            if (response.status.isSuccess()) {
                val body: T = response.body()
                emit(Either.Right(mapper(body)))
            } else {
                if (code >= 500) {
                    emit(Either.Left(NetworkError.ServerIsNotAvailable))
                } else {
                    emit(Either.Left(NetworkError.Api(response.request.toString(), code)))
                }
            }
        } catch (e: IOException) {
            emit(Either.Left(NetworkError.NoInternetConnection))
        } catch (e: SerializationException) {
            emit(Either.Left(NetworkError.ResponseDeserialization(e.message ?: "")))
        } catch (e: Throwable) {
            emit(Either.Left(NetworkError.Unexpected(e.message ?: "")))
        }
    }
        .flowOn(AppCoroutineDispatchers.ioDispatcher)
        .catch { e ->
            emit(Either.Left(NetworkError.Unexpected(e.message ?: "")))
        }
}