package org.example.data.mappers

import org.example.data.base.Mapper
import org.example.data.remote.dtos.LocationDto
import org.example.domain.model.Location

object LocationMapper : Mapper<LocationDto, Location> {
    override fun map(data: LocationDto) = Location(
        id = data.id,
        name = data.name,
        type = data.type,
        dimension = data.dimension,
        residents = data.residents,
        url = data.url,
        created = data.created
    )
}