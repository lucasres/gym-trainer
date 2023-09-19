package com.example.gymtrainer.presentation.windows

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.PositionIndicator
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.ScalingLazyColumn
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.rememberScalingLazyListState
import com.example.gymtrainer.data.WorkoutRepository
import com.example.gymtrainer.presentation.components.TimeTextGlobal
import com.example.gymtrainer.presentation.components.WorkoutComponent

@Composable
fun WorkoutSelect() {
    val listState = rememberScalingLazyListState()
    val workouts = WorkoutRepository().getAll()

    Scaffold (
        modifier = Modifier
            .fillMaxWidth(),
        timeText = { TimeTextGlobal() },
        positionIndicator = {
            PositionIndicator(scalingLazyListState = listState)
        }
    ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            ScalingLazyColumn(state = listState) {
                item {
                    Text(text = "Selecionar Treino")
                }
                items(workouts.size) {
                        index -> WorkoutComponent(workouts[index].name)
                }
                item {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Adicionar Treino")
                        }
                }
            }
        }
    }
}