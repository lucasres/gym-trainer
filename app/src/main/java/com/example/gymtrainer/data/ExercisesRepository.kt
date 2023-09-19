package com.example.gymtrainer.data

import com.example.gymtrainer.model.Exercise

class ExercisesRepository {
    fun getAllExercises(): List<Exercise> {
        return listOf<Exercise>(
            Exercise("Teste 1"),
            Exercise("Teste 2"),
            Exercise("Teste 3"),
            Exercise("Teste 4"),
            Exercise("Teste 5"),
        )
    }
}