package io.github.thaikotlindev.taskuniverse.data.repository;

import java.util.List;

import io.github.thaikotlindev.taskuniverse.data.model.Task;

public interface TaskRepository {

    List<Task> getTaskList();
    Task getTaskDetails(String id);
}
