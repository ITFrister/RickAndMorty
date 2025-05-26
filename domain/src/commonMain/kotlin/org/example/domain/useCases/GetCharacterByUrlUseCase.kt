package org.example.domain.useCases

import org.example.domain.repositories.MainRepository

class GetCharacterByUrlUseCase(
    private val repository: MainRepository
) {
    operator fun invoke(url: String) = repository.getCharacterByUrl(url)
}