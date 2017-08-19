package io.github.thaikotlindev.taskuniverse.presentation.tasklist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import io.github.thaikotlindev.taskuniverse.R;
import io.github.thaikotlindev.taskuniverse.data.model.Task;
import io.github.thaikotlindev.taskuniverse.data.repository.TaskRepository;
import io.github.thaikotlindev.taskuniverse.presentation.di.Injector;
import io.github.thaikotlindev.taskuniverse.presentation.taskdetails.TaskDetailsActivity;

public class TaskListActivity extends AppCompatActivity {

    // inject
    public TaskRepository repository;

    private RecyclerView taskRecyclerView;
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.inject(this);
        setupView();
        getTaskList();
    }

    private void setupView() {
        setContentView(R.layout.activity_task_list);
        setupAdapter();
        setupRecyclerView();
    }

    private void setupAdapter() {
        taskAdapter = new TaskAdapter(Collections.<Task>emptyList());
        taskAdapter.setOnClickListener(new TaskAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Task task) {
                // TODO : start task details activity
                Intent intent = new Intent(TaskListActivity.this, TaskDetailsActivity.class);
                intent.putExtra(TaskDetailsActivity.KEY_TASK_ID, task.getId());
                startActivity(intent);
            }
        });
    }

    private void setupRecyclerView() {
        taskRecyclerView = (RecyclerView) findViewById(R.id.rvTasks);
        taskRecyclerView.setHasFixedSize(true);
        taskRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        taskRecyclerView.setAdapter(taskAdapter);
    }

    private void getTaskList() {
        List<Task> tasks = repository.getTaskList();
        taskAdapter.setTasks(tasks);
    }
}
