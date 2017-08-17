package io.github.thaikotlindev.taskuniverse.presentation.tasklist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.github.thaikotlindev.taskuniverse.R;
import io.github.thaikotlindev.taskuniverse.data.model.Task;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Task task);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;

        public ViewHolder(View view) {
            super(view);
            tvTitle = (TextView) view.findViewById(R.id.tvTaskTitle);
        }

        public void bind(final Task task, final OnItemClickListener clickListener) {
            tvTitle.setText(task.getTitle());
            tvTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (clickListener != null) {
                        clickListener.onItemClick(task);
                    }
                }
            });
        }
    }

    private List<Task> tasks;
    private OnItemClickListener listener;

    public TaskAdapter(List<Task> tasks) {
        setTasks(tasks);
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
        notifyDataSetChanged();
    }

    public void setOnClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewholder_task, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.bind(task, listener);
    }
}
