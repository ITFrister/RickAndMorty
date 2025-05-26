package org.example.di

import org.example.Greeting
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val presentationModule = module {
    singleOf(::Greeting)
}