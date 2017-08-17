package io.github.thaikotlindev.taskuniverse.presentation.taskdetails

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.thaikotlindev.taskuniverse.R
import io.github.thaikotlindev.taskuniverse.data.model.Task
import io.github.thaikotlindev.taskuniverse.data.repository.TaskRepository
import io.github.thaikotlindev.taskuniverse.presentation.di.Injector

class TaskDetailsActivity : AppCompatActivity() {

    // inject
    lateinit var repository: TaskRepository

    private val actionItemAdapter = ActionItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Injector.inject(this)
        setupView()
        setContent()
    }

    private fun setupView() {
        setContentView(R.layout.activity_task_details)
        setupTaskImageView()
        setupActionItemsRecyclerView()
    }

    private fun setupTaskImageView() {
        // TODO #3
    }

    private fun setupActionItemsRecyclerView() {
        // TODO #4
//        setHasFixedSize(true)
//        LinearLayoutManager(this@TaskDetailsActivity)
    }

    private fun setContent() {
        val id = extractTaskIdFromIntent()
        val task = repository.getTaskDetails(id)
        setTaskDetails(task)
    }

    private fun extractTaskIdFromIntent(): String {
        // TODO #1
        return ""
    }

    private fun setTaskDetails(task: Task) {
        // TODO #2

//        Glide.with(this).load(task.imageUrl).into(ivTaskImage)
        
//        editActionItemValues()
    }

//    private fun editActionItemValues() {
//        Handler().postDelayed({
//            actionItemAdapter.actionItems = listOf("e", "f")
//        }, 2000)
//    }
}