package com.darrenfinch.todolistadapterdemo.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.darrenfinch.todolistadapterdemo.AnimationUtils
import com.darrenfinch.todolistadapterdemo.R
import com.darrenfinch.todolistadapterdemo.Task
import kotlinx.android.synthetic.main.task_item.view.*

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    private var isExpanded = false
    fun bind(task: Task)
    {
        itemView.taskName.text = task.taskName
        itemView.taskDescription.text = task.taskDescription
        itemView.dropdownButton.setOnClickListener {
            if (isExpanded) collapse() else expand()
        }

        //All tasks should be collapsed by default
        collapse()
    }

    private fun expand()
    {
        AnimationUtils.expand(itemView.taskDescription)
        itemView.dropdownButton.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp)
        isExpanded = true
    }
    private fun collapse()
    {
        AnimationUtils.collapse(itemView.taskDescription)
        itemView.dropdownButton.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp)
        isExpanded = false
    }
}