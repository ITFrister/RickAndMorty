package org.example.data.remote.repositories

import org.example.data.base.BaseRepository
import org.example.data.base.BaseResponse
import org.example.data.mappers.CharacterMapper
import org.example.data.mappers.EpisodeMapper
import org.example.data.mappers.LocationMapper
import org.example.data.remote.apiServices.ApiService
import org.example.data.remote.dtos.CharacterDto
import org.example.data.remote.dtos.EpisodeDto
import org.example.data.remote.dtos.LocationDto
import org.example.domain.model.Character
import org.example.domain.model.Episode
import org.example.domain.model.Location
import org.example.domain.repositories.MainRepository

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