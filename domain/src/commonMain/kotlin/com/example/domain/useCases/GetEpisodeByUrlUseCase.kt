package com.example.domain.useCases

import com.example.domain.repositories.MainRepository

class GetEpisodeByUrlUseCase(
    private val repository: MainRepository
) {
    operator fun invoke(url: String) = repository.getEpisodeByUrl(url)
}