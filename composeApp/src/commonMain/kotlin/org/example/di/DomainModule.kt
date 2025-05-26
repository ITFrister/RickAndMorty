package org.example.di

import org.example.domain.useCases.GetCharacterByUrlUseCase
import org.example.domain.useCases.GetCharactersUseCase
import org.example.domain.useCases.GetEpisodeByUrlUseCase
import org.example.domain.useCases.GetEpisodesUseCase
import org.example.domain.useCases.GetLocationByUrlUseCase
import org.example.domain.useCases.GetLocationsUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val domainModule = module {
    singleOf(::GetCharacterByUrlUseCase)
    singleOf(::GetCharactersUseCase)
    singleOf(::GetEpisodeByUrlUseCase)
    singleOf(::GetEpisodesUseCase)
    singleOf(::GetLocationByUrlUseCase)
    singleOf(::GetLocationsUseCase)
}