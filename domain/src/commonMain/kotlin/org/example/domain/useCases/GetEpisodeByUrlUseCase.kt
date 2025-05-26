package org.example.domain.useCases

import org.example.domain.repositories.MainRepository

class GetEpisodeByUrlUseCase(
    private val repository: MainRepository
) {
    operator fun invoke(url: String) = repository.getEpisodeByUrl(url)
}