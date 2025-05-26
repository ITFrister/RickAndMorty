package org.example.domain.useCases

import org.example.domain.repositories.MainRepository

class GetCharactersUseCase(
    private val repository: MainRepository
) {
    operator fun invoke() = repository.getCharacters()
}