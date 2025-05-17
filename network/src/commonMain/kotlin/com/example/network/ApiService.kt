package com.example.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.json.JsonObject

class ApiService(private val httpClient: HttpClient) {

    private val commonScope = CoroutineScope(Dispatchers.Default)


    fun fetchCharacterAndLog(characterId: Int = 69, callback: (Result<JsonObject>) -> Unit) {
        val url = "https://rickandmortyapi.com/api/character/$characterId"

        commonScope.launch { // Запускаем в общем скоупе
            try {
                println("Ktor Test: Отправка запроса на: $url")
                val characterJson: JsonObject = httpClient.get(url).body()
                println("Ktor Test: Получен JSON (как JsonObject):\n$characterJson")
                callback(Result.success(characterJson))
            } catch (e: Exception) {
                println("Ktor Test: Ошибка при выполнении запроса: ${e.message}")
                e.printStackTrace()
                callback(Result.failure(e))
            }
            // httpClient здесь не закрываем, если он используется как синглтон и управляется извне
        }
    }

    // Если нужно закрыть клиент (например, при завершении работы приложения)
    // Этот метод должен вызываться из платформенного кода, когда клиент больше не нужен.
    fun closeClient() {
        httpClient.close()
    }
}