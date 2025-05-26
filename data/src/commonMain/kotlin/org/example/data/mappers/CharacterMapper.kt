package org.example.data.mappers

import org.example.data.base.Mapper
import org.example.data.remote.dtos.CharacterDto
import org.example.domain.model.Character

object CharacterMapper : Mapper<CharacterDto, Character> {
    override fun map(data: CharacterDto) = Character(
        id = data.id,
        name = data.name,
        status = data.status,
        species = data.species,
        type = data.type,
        gender = data.gender,
        origin = Character.Origin(name = data.origin.name, url = data.origin.url),
        location = Character.Location(name = data.location.name, url = data.location.url),
        image = data.image,
        episode = data.episode,
        url = data.url,
        created = data.created
    )
}