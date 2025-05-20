package com.example.domain.useCases

import com.example.domain.repositories.MainRepository

class GetEpisodesUseCase(
    private val repository: MainRepository
) {
    operator fun invoke() = repository.getEpisodes()
}