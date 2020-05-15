package com.darrenfinch.todolistadapterdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.darrenfinch.todolistadapterdemo.adapter.TodoRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    private val todoRecyclerViewAdapter = TodoRecyclerViewAdapter(mutableListOf())

    private val tasks = listOf(
        Task("Clean kitchen", "Sweep floor, take out trash, clean dishes."),
        Task("Write blog post", "Prepare code and outline, cry, write, cry again, hit publish."),
        Task("Finish app", "Ain't happening today son."))

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart()
    {
        todoRecyclerView.adapter = todoRecyclerViewAdapter
        todoRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
        todoRecyclerViewAdapter.updateTasks(tasks)
        super.onStart()
    }
}
