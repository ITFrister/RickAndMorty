package org.example

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.network.ApiService
import com.example.network.createEngine
import com.example.network.createHttpClient
import org.koin.compose.koinInject

@Composable
fun MyTestScreen(
    apiService: ApiService = koinInject()
) {
    var resultText by remember { mutableStateOf("Нажмите для загрузки...") }

    Button(onClick = {
        resultText = "Загрузка..."
        apiService.fetchCharacterAndLog { result ->
            result.fold(
                onSuccess = { jsonObject ->
                    // В Android логи будут в LogCat
                    // Обновляем UI на главном потоке, если нужно
                    // (fetchCharacterAndLog использует Dispatchers.Default, так что для UI может понадобиться withContext(Dispatchers.Main))
                    resultText = "Успех! JSON в логах. Имя: ${jsonObject["name"]}"
                    println("Android UI: Успех! JSON: $jsonObject") // Для LogCat
                },
                onFailure = { error ->
                    resultText = "Ошибка: ${error.message}"
                    println("Android UI: Ошибка: ${error.message}") // Для LogCat
                }
            )
        }
    }) {
        Text(resultText)
    }
}