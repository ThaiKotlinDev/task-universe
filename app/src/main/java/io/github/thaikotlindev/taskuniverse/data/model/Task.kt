package io.github.thaikotlindev.taskuniverse.data.model

data class Task(val id: String,
           val title: String,
           val description: String,
           val imageUrl: String,
           val actionItems: List<String>)

