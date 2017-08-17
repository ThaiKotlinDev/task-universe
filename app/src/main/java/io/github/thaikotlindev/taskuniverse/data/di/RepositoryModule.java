package io.github.thaikotlindev.taskuniverse.data.di;

import io.github.thaikotlindev.taskuniverse.data.repository.TaskRepository;
import io.github.thaikotlindev.taskuniverse.data.repository.TaskRepositoryImpl;

public class RepositoryModule {

    public static TaskRepository provideTaskRepository() {
        return new TaskRepositoryImpl();
    }
}
