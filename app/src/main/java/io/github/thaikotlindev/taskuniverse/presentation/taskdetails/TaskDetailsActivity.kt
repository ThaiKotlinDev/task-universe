package io.github.thaikotlindev.taskuniverse.presentation.taskdetails

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.bumptech.glide.Glide
import io.github.thaikotlindev.taskuniverse.R
import io.github.thaikotlindev.taskuniverse.data.model.Task
import io.github.thaikotlindev.taskuniverse.data.repository.TaskRepository
import io.github.thaikotlindev.taskuniverse.presentation.di.Injector
import io.github.thaikotlindev.taskuniverse.presentation.extension.applyRedFilter
import kotlinx.android.synthetic.main.activity_task_details.*

class TaskDetailsActivity : AppCompatActivity() {

    companion object {
        const val KEY_TASK_ID = "task_id"
    }

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
        ivTaskImage.setOnClickListener {
            ivTaskImage.applyRedFilter()
        }
    }

    private fun setupActionItemsRecyclerView() {
        rvActionItems.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@TaskDetailsActivity)
            adapter = actionItemAdapter.apply {
                actionItemClick = {
                    Toast.makeText(this@TaskDetailsActivity, it, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun setContent() {
        val id = extractTaskIdFromIntent()
        val task = repository.getTaskDetails(id)
        setTaskDetails(task)
    }

    private fun extractTaskIdFromIntent(): String = intent.getStringExtra(KEY_TASK_ID)

    private fun setTaskDetails(task: Task) {
        tvTaskTitle.text = task.title
        tvTaskDescription.text = task.description
        Glide.with(this).load(task.imageUrl).into(ivTaskImage)
        actionItemAdapter.actionItems = task.actionItems
        editActionItemValues()
    }

    private fun editActionItemValues() {
        Handler().postDelayed({
            actionItemAdapter.actionItems = listOf("e", "f")
        }, 2000)
    }
}