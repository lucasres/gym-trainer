package com.example.gymtrainer.presentation.windows

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.PositionIndicator
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.ScalingLazyColumn
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.material.rememberScalingLazyListState
import com.example.gymtrainer.data.ExercisesRepository
import com.example.gymtrainer.presentation.components.ExerciseComponent


@Composable
fun GuideExercise() {
    val listState = rememberScalingLazyListState()
    var exercises = ExercisesRepository().getAllExercises()

    TimeText()
    Scaffold (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(0.dp, 10.dp),
        positionIndicator = {
            PositionIndicator(scalingLazyListState = listState)
        }
    ) {
        ScalingLazyColumn(state = listState) {
            item {
                Text(text = "Treino A")
            }
            items(exercises.size) {
                index -> ExerciseComponent(name = exercises[index].name)
            }
        }
    }
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun GuideExercisePreview() {
    GuideExercise()
}