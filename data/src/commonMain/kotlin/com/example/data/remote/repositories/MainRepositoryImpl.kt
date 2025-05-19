package com.example.data.remote.repositories

import com.example.data.remote.apiServices.ApiService
import com.example.domain.model.Character
import com.example.domain.model.Episode
import com.example.domain.model.Location
import com.example.domain.repositories.MainRepository
import com.example.domain.utils.Either
import com.example.domain.utils.NetworkError
import kotlinx.coroutines.flow.Flow

class MainRepositoryImpl(
    private val apiService: ApiService
) : MainRepository{
    override fun getCharacterByUrl(url: String): Flow<Either<NetworkError, Character>> {
        TODO("Not yet implemented")
    }

    override fun getCharacters(): Flow<Either<NetworkError, List<Character>>> {
        TODO("Not yet implemented")
    }

    override fun getLocationByUrl(url: String): Flow<Either<NetworkError, Location>> {
        TODO("Not yet implemented")
    }

    override fun getLocations(): Flow<Either<NetworkError, List<Location>>> {
        TODO("Not yet implemented")
    }

    override fun getEpisodeByUrl(url: String): Flow<Either<NetworkError, Episode>> {
        TODO("Not yet implemented")
    }

    override fun getEpisodes(): Flow<Either<NetworkError, List<Episode>>> {
        TODO("Not yet implemented")
    }
}