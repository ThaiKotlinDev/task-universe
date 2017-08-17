package io.github.thaikotlindev.taskuniverse.presentation.taskdetails

//class TaskDetailsPresenterImpl(val view: TaskDetailsContract.TaskDetailsView) : TaskDetailsContract.TaskDetailsPresenter {
//
//    // inject
//    lateinit var repository: TaskRepository
//
//    init {
//        Injector.inject(this)
//    }
//
//    override fun getTaskDetails(taskId: String) {
//        val task = repository.getTaskDetails(taskId)
//        task?.let { view.setTaskDetails(it) }
//    }
//}