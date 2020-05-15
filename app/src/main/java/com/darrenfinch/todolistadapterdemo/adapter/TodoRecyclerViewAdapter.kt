package com.darrenfinch.todolistadapterdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.darrenfinch.todolistadapterdemo.R
import com.darrenfinch.todolistadapterdemo.Task

class TodoRecyclerViewAdapter(private val allTasks: MutableList<Task>) : RecyclerView.Adapter<TaskViewHolder>()
{
    fun updateTasks(newTasks: List<Task>)
    {
        allTasks.clear()
        allTasks.addAll(newTasks)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder
    {
        return TaskViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false))
    }
    override fun getItemCount(): Int = allTasks.size
    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) = holder.bind(allTasks[position])
}