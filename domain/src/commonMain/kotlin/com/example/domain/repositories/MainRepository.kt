package com.example.domain.repositories

import com.example.domain.model.Character
import com.example.domain.model.Episode
import com.example.domain.model.Location
import com.example.domain.utils.RemoteWrapper

interface MainRepository {
    fun getCharacterByUrl(url: String): RemoteWrapper<Character>
    fun getCharacters(): RemoteWrapper<List<Character>>
    fun getLocationByUrl(url: String): RemoteWrapper<Location>
    fun getLocations(): RemoteWrapper<List<Location>>
    fun getEpisodeByUrl(url: String): RemoteWrapper<Episode>
    fun getEpisodes(): RemoteWrapper<List<Episode>>
}