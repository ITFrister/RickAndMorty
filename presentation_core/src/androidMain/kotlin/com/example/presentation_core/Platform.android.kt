package com.example.presentation_core

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun TestPreview() {
    val text = remember { mutableStateOf("Hello KMP") }
    val state = remember { mutableStateOf(true) }
    Box {
        Column {
            Text(text = text.value)
            Button(onClick = {
                text.value = when(state.value) {
                    true -> "Hello Compose"
                    false -> "Hello KMP"
                }
                state.value = !state.value
            }) {
                Text(text = "Click me")
            }
        }
    }
}