package io.github.thaikotlindev.taskuniverse.presentation.taskdetails

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.thaikotlindev.taskuniverse.R

class ActionItemAdapter : RecyclerView.Adapter<ActionItemAdapter.ViewHolder>() {

    var actionItems: List<String> = listOf()

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(itemTitle: String) {
            // TODO #3
        }
    }

    override fun getItemCount(): Int {
        // TODO #1
        return 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.viewholder_action_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        // TODO #2
    }
}