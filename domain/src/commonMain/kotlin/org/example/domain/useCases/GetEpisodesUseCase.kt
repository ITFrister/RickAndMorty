package org.example.domain.useCases

import org.example.domain.repositories.MainRepository

class GetEpisodesUseCase(
    private val repository: MainRepository
) {
    operator fun invoke() = repository.getEpisodes()
}