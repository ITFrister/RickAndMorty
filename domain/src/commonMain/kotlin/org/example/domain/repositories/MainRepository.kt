package org.example.domain.repositories

import org.example.domain.model.Character
import org.example.domain.model.Episode
import org.example.domain.model.Location
import org.example.domain.utils.RemoteWrapper

interface MainRepository {
    fun getCharacterByUrl(url: String): RemoteWrapper<Character>
    fun getCharacters(): RemoteWrapper<List<Character>>
    fun getLocationByUrl(url: String): RemoteWrapper<Location>
    fun getLocations(): RemoteWrapper<List<Location>>
    fun getEpisodeByUrl(url: String): RemoteWrapper<Episode>
    fun getEpisodes(): RemoteWrapper<List<Episode>>
}