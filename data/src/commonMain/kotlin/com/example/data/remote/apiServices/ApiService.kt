package com.example.data.remote.apiServices

import com.example.data.base.BaseResponse
import com.example.data.remote.dtos.CharacterDto
import com.example.data.remote.dtos.EpisodeDto
import com.example.data.remote.dtos.LocationDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import org.example.core.AppConfig

class ApiService(private val client: HttpClient) {
    private val baseUrl = AppConfig.BASE_URL

    suspend fun getCharacterByUrl(url: String): CharacterDto {
        return client.get(url).body()
    }

    suspend fun getCharacters(): BaseResponse<CharacterDto> {
        return client.get("${baseUrl}character").body()
    }

    suspend fun getLocationByUrl(url: String): LocationDto {
        return client.get(url).body()
    }

    suspend fun getLocations(): BaseResponse<LocationDto> {
        return client.get("${baseUrl}location").body()
    }

    suspend fun getEpisodeByUrl(url: String): EpisodeDto {
        return client.get(url).body()
    }

    suspend fun getEpisodes(): BaseResponse<EpisodeDto> {
        return client.get("${baseUrl}episode").body()
    }

}