package io.github.thaikotlindev.taskuniverse.data.repository;

import java.util.Arrays;
import java.util.List;

import io.github.thaikotlindev.taskuniverse.data.model.Task;

public class TaskRepositoryImpl implements TaskRepository {

    private static List<Task> tasks = Arrays.asList(
            new Task("1", "First Task", "This is a first task.",
                    "https://thaikotlindev.github.io/images/meetup/04.jpg", Arrays.asList("a", "b", "c")),
            new Task("2", "Second Task", "The second task.",
                    "https://goo.gl/oMZkeT", Arrays.asList("A", "i", "r")),
            new Task("3", "Third Task", "Another task in the BIG Universe.",
                    "https://goo.gl/fpMPP9", Arrays.asList("a", "b", "c")),
            new Task("4", "Fourth Task", "It's Him!" ,
                    "https://goo.gl/tbfx3D", Arrays.asList("b", "i", "r", "t", "h")),
            new Task("5", "Fifth Task", "P'F",
                    "https://goo.gl/Mf8y15", Arrays.asList("P", "F")),
            new Task("6", "Handsome", "Crazy",
                    "https://goo.gl/ni1VWV", Arrays.asList("D", "E", "W")),
            new Task("7", "Travis", "Travis",
                    "https://goo.gl/C8HjwL", Arrays.asList("P")),
            new Task("8", "Pop", "Pop",
                    "https://goo.gl/9rGXZx", Arrays.asList("P", "O", "P")),
            new Task("9", "Babe", "Babe",
                    "https://goo.gl/2D6C9s", Arrays.asList("B", "A", "B", "E")),
            new Task("10", "Ju", "Ju",
                    "https://goo.gl/rbei9h", Arrays.asList("J", "U")),
            new Task("11", "Tow", "Tow",
                    "https://goo.gl/WpyUh7", Arrays.asList("T", "O", "W"))
    );

    @Override
    public List<Task> getTaskList() {
        return tasks;
    }

    @Override
    public Task getTaskDetails(String id) {
        Task result = null;
        for (int i=0; i<tasks.size(); i++) {
            if (tasks.get(i).getId().equals(id)) {
                result = tasks.get(i);
                break;
            }
        }

        return result;
    }
}
