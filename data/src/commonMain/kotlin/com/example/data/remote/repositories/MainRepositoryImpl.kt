package com.example.data.remote.repositories

import com.example.data.base.BaseRepository
import com.example.data.base.BaseResponse
import com.example.data.mappers.CharacterMapper
import com.example.data.mappers.EpisodeMapper
import com.example.data.mappers.LocationMapper
import com.example.data.remote.apiServices.ApiService
import com.example.data.remote.dtos.CharacterDto
import com.example.data.remote.dtos.EpisodeDto
import com.example.data.remote.dtos.LocationDto
import com.example.domain.model.Character
import com.example.domain.model.Episode
import com.example.domain.model.Location
import com.example.domain.repositories.MainRepository

class MainRepositoryImpl(
    private val apiService: ApiService
) : MainRepository, BaseRepository() {
    override fun getCharacterByUrl(url: String) = doRequest<CharacterDto, Character>(
        request = { apiService.getCharacterByUrl(url) },
        mapper = { CharacterMapper.map(it) }
    )

    override fun getCharacters() = doRequest<BaseResponse<CharacterDto>, List<Character>>(
        request = { apiService.getCharacters() },
        mapper = { CharacterMapper.mapList(it.results) }
    )

    override fun getLocationByUrl(url: String) = doRequest<LocationDto, Location>(
        request = { apiService.getLocationByUrl(url) },
        mapper = { LocationMapper.map(it) }
    )

    override fun getLocations() = doRequest<BaseResponse<LocationDto>, List<Location>>(
        request = { apiService.getLocations() },
        mapper = { LocationMapper.mapList(it.results) }
    )

    override fun getEpisodeByUrl(url: String) = doRequest<EpisodeDto, Episode>(
        request = { apiService.getEpisodeByUrl(url) },
        mapper = { EpisodeMapper.map(it) }
    )

    override fun getEpisodes() = doRequest<BaseResponse<EpisodeDto>, List<Episode>>(
        request = { apiService.getEpisodes() },
        mapper = { EpisodeMapper.mapList(it.results) }
    )
}