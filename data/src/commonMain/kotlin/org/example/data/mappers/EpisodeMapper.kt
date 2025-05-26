package org.example.data.mappers

import org.example.data.base.Mapper
import org.example.data.remote.dtos.EpisodeDto
import org.example.domain.model.Episode

object EpisodeMapper : Mapper<EpisodeDto, Episode> {
    override fun map(data: EpisodeDto) = Episode(
        id = data.id,
        name = data.name,
        airDate = data.airDate,
        episode = data.episode,
        characters = data.characters,
        url = data.url,
        created = data.created
    )
}