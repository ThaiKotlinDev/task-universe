package io.github.thaikotlindev.taskuniverse.data.repository

import io.github.thaikotlindev.taskuniverse.data.model.Task
import java.util.*

class KotlinTaskRepositoryImpl : TaskRepository {

    private val tasks = listOf( 
            Task("1", "First Kotlin Task", "This is a first task.",
                    "https://thaikotlindev.github.io/images/meetup/04.jpg", listOf("a", "b", "c")),
            Task("2", "Second Task", "The second task.",
                    "https://goo.gl/oMZkeT", listOf("A", "i", "r")),
            Task("3", "Third Task", "Another task in the BIG Universe.",
                    "https://goo.gl/fpMPP9", listOf("a", "b", "c")),
            Task("4", "Fourth Task", "It's Him!",
                    "https://goo.gl/tbfx3D", listOf("b", "i", "r", "t", "h")),
            Task("5", "Fifth Task", "P'F",
                    "https://goo.gl/Mf8y15", listOf("P", "F")),
            Task("6", "Handsome", "Crazy",
                    "https://goo.gl/ni1VWV", listOf("D", "E", "W")),
            Task("7", "Travis", "Travis",
                    "https://goo.gl/C8HjwL", listOf("P")),
            Task("8", "Pop", "Pop",
                    "https://goo.gl/9rGXZx", listOf("P", "O", "P")),
            Task("9", "Babe", "Babe",
                    "https://goo.gl/2D6C9s", listOf("B", "A", "B", "E")),
            Task("10", "Ju", "Ju",
                    "https://goo.gl/rbei9h", listOf("J", "U")),
            Task("11", "Tow", "Tow",
                    "https://goo.gl/WpyUh7", listOf("T", "O", "W"))
    )

    override fun getTaskList(): List<Task> = tasks

    override fun getTaskDetails(id: String?): Task? = tasks.find { it.id == id }

}