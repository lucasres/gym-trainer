package com.example.gymtrainer.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import com.example.gymtrainer.model.Workout

@Composable
fun WorkoutComponent(name: String) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(1.dp)
    ) {
        Text(
            text = name,
        )
        Button(
            onClick = { },
        ) {
            Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null)
        }
    }
}

@Preview
@Composable
fun PreviewWorkoutComponent() {
    WorkoutComponent(name = "Treino A")
}
