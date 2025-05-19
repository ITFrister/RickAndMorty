package com.example.presentation_core.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.domain.model.Character
import com.example.presentation_core.ui.components.CharacterItem

@Preview
@Composable
fun CharacterItemPreview() {
    val character = Character(
        id = 1,
        name = "Rick Sanchez",
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Character.Origin("Earth", "https://rickandmortyapi.com/api/location/1"),
        location = Character.Location("Home", ""),
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/1"),
        url = "https://rickandmortyapi.com/api/character/1",
        created = "2017-11-04T18:48:46.250Z"
    )
    CharacterItem(character)
}