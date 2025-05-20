package com.example.data.mappers

import com.example.data.base.Mapper
import com.example.data.remote.dtos.LocationDto
import com.example.domain.model.Location

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