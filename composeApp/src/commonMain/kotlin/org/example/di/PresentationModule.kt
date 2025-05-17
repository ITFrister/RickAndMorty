package org.example.di

import org.example.Greeting
import org.example.TestViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

expect val platformPresentationModule: Module

val presentationModule = module {
    viewModel { TestViewModel(get()) }
    single { Greeting(get()) }
}