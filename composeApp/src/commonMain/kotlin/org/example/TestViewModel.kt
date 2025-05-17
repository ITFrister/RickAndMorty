package org.example

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TestViewModel(
    private val greeting: Greeting
) : ViewModel() {
    private val _greetingFlow = MutableStateFlow(greeting.greet())
    val greetingFlow: StateFlow<String> get() = _greetingFlow
}