package io.github.thaikotlindev.taskuniverse.presentation.di;

import io.github.thaikotlindev.taskuniverse.data.di.RepositoryModule;
import io.github.thaikotlindev.taskuniverse.presentation.taskdetails.TaskDetailsActivity;
import io.github.thaikotlindev.taskuniverse.presentation.tasklist.TaskListActivity;

public class Injector {

    public static void inject(TaskListActivity activity) {
        activity.repository = RepositoryModule.provideTaskRepository();
    }

    public static void inject(TaskDetailsActivity activity) {
        activity.repository = RepositoryModule.provideTaskRepository();
    }

//    public static void inject(TaskDetailsPresenterImpl presenter) {
//        presenter.repository = RepositoryModule.provideTaskRepository();
//    }
}
