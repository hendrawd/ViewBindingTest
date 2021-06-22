package com.mokapos.android.viewbindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FindViewByIdActivity : AppCompatActivity() {

    // TODO FindViewByIdActivity 1
    private lateinit var tvHelloWorld: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_view_by_id)
        // TODO FindViewByIdActivity 2
        tvHelloWorld = findViewById(R.id.tvHelloWorld)
    }

    // TODO FindViewByIdActivity 3
    fun doSomething() {
        tvHelloWorld.text = "I'm doing something!"
    }

    // TODO FindViewByIdActivity 4
    fun doSomethingElse() {
        tvHelloWorld.text = "I'm doing something else!"
    }

    // TODO FindViewByIdActivity 5 quiz:
    // Why do we save tvHelloWorld as lateinit member variable instead of findViewById every time
    // inside those functions?
}