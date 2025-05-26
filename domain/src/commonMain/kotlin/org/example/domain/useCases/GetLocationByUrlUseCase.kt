package org.example.domain.useCases

import org.example.domain.repositories.MainRepository

class GetLocationByUrlUseCase(
    private val repository: MainRepository
) {
    operator fun invoke(url: String) = repository.getLocationByUrl(url)
}