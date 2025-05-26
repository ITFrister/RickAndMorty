package org.example.presentation_core.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import org.example.domain.model.Character
import org.example.presentation_core.theme.Colors

@Composable
fun CharacterItem(character: Character) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp)
            .background(Color(0x000000)),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().background(Colors.characterCardBackground)
        ) {
            AsyncImage(
                model = character.image,
                contentDescription = character.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
            )

            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = character.name,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 1,
                    color = Colors.title
                )

                Row {
                    val statusColor = when (character.status.lowercase()) {
                        "alive" -> Colors.statusAlive
                        "dead" -> Colors.statusDead
                        else -> Colors.statusUnknown
                    }
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .clip(CircleShape)
                            .background(statusColor)
                            .align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "${character.status} - ${character.species}",
                        style = MaterialTheme.typography.bodySmall,
                        color = Colors.text,
                        modifier = Modifier.padding(start = 4.dp)
                    )
                }


                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Last known location:",
                    style = MaterialTheme.typography.labelSmall,
                    color = Colors.textSecondary
                )
                Text(
                    text = character.location.name,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Colors.text
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "First seen in:",
                    style = MaterialTheme.typography.labelSmall,
                    color = Colors.textSecondary
                )
                Text(
                    text = character.episode.first(),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Colors.text
                )
            }
        }
    }
}