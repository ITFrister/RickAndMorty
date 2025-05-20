package com.example.domain.useCases

import com.example.domain.repositories.MainRepository

class GetLocationsUseCase(
    private val repository: MainRepository
) {
    operator fun invoke() = repository.getLocations()
}