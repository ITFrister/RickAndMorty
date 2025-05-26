package org.example.data.remote.apiServices

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import org.example.core.AppConfig

class ApiService(private val client: HttpClient) {
    private val baseUrl = AppConfig.BASE_URL

    suspend fun getCharacterByUrl(url: String): HttpResponse = client.get(url)
    suspend fun getCharacters(): HttpResponse = client.get("${baseUrl}character")

    suspend fun getLocationByUrl(url: String): HttpResponse = client.get(url)
    suspend fun getLocations(): HttpResponse = client.get("${baseUrl}location")

    suspend fun getEpisodeByUrl(url: String): HttpResponse = client.get(url)
    suspend fun getEpisodes(): HttpResponse = client.get("${baseUrl}episode")

}