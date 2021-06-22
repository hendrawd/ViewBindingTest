package com.mokapos.android.viewbindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// TODO ViewBindingActivity 2
import com.mokapos.android.viewbindingtest.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    // TODO ViewBindingActivity 3
    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO ViewBindingActivity 4
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    // TODO ViewBindingActivity 5
    fun doSomething() {
        binding.tvHelloWorld.text = "I'm doing something!"
    }

    // TODO ViewBindingActivity 6
    fun doSomethingElse() {
        binding.tvHelloWorld.text = "I'm doing something else!"
    }
}