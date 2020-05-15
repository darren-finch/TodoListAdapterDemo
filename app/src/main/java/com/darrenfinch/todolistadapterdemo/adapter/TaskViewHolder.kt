package com.darrenfinch.todolistadapterdemo.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.darrenfinch.todolistadapterdemo.Task
import kotlinx.android.synthetic.main.task_item.view.*

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    fun bind(task: Task)
    {
        itemView.taskName.text = task.taskName
        itemView.taskDescription.text = task.taskDescription
    }
}