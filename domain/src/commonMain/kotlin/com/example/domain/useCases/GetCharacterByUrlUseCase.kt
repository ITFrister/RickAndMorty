package com.example.domain.useCases

import com.example.domain.repositories.MainRepository

class GetCharacterByUrlUseCase(
    private val repository: MainRepository
) {
    operator fun invoke(url: String) = repository.getCharacterByUrl(url)
}