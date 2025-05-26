package org.example.domain.useCases

import org.example.domain.repositories.MainRepository

class GetLocationsUseCase(
    private val repository: MainRepository
) {
    operator fun invoke() = repository.getLocations()
}