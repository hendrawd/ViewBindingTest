package com.mokapos.android.viewbindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// TODO SyntheticsActivity 2
import kotlinx.android.synthetic.main.activity_synthetics.*

class SyntheticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_synthetics)
    }

    // TODO SyntheticsActivity 3
    fun doSomething() {
        tvHelloWorld.text = "I'm doing something!"
    }

    // TODO SyntheticsActivity 4
    fun doSomethingElse() {
        tvHelloWorld.text = "I'm doing something else!"
    }

    // TODO SyntheticsActivity 4 quiz:
    // What is the downside of using
    // tvHelloWorld.text = "I'm doing something!"
    // inside doSomething function?
}