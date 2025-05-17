package com.example.data.remote.apiServices

import com.example.data.remote.dtos.CharacterItemDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.http.cio.Response
import kotlinx.serialization.json.JsonObject

class ApiService(private val client: HttpClient) {
    suspend fun fetchCharacters(id: Int): CharacterItemDto {
        return client.get("character/$id").body()
    }
}