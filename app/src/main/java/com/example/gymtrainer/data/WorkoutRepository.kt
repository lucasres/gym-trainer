package com.example.gymtrainer.data

import com.example.gymtrainer.model.Workout

class WorkoutRepository {
    fun getAll(): List<Workout> {
        return  listOf(
            Workout("Treino A"),
            Workout("Treino B"),
            Workout("Treino C"),
        )
    }
}