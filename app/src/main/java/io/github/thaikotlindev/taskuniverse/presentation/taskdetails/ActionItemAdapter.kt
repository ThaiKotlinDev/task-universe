package io.github.thaikotlindev.taskuniverse.presentation.taskdetails

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.thaikotlindev.taskuniverse.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.viewholder_action_item.*
import kotlin.properties.Delegates

typealias ActionItemOnClick = (String) -> Unit

class ActionItemAdapter : RecyclerView.Adapter<ActionItemAdapter.ViewHolder>() {

    var actionItemClick: (ActionItemOnClick)? = null

    var actionItems: List<String> by Delegates.observable(listOf()) { _, _, _ ->
        notifyDataSetChanged()
    }

    class ViewHolder(override val containerView: View?) : RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bind(itemTitle: String, onClick: (ActionItemOnClick)?) {
            tvActionItem.text = itemTitle
            onClick?.invoke(itemTitle)
        }
    }

    override fun getItemCount(): Int = actionItems.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.viewholder_action_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(actionItems[position], actionItemClick)
    }
}