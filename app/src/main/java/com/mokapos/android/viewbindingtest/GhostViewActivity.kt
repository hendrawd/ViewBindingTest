package com.mokapos.android.viewbindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.mokapos.android.viewbindingtest.databinding.ActivityGhostViewBinding
import kotlinx.android.synthetic.main.activity_ghost_view.*

class GhostViewActivity : AppCompatActivity() {

     private lateinit var binding: ActivityGhostViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ghost_view)

//        binding = ActivityGhostViewBinding.inflate(layoutInflater)
//        setContentView(binding.root)
    }

    fun doSomethingWithGhost(view: View) {
        // if we support multiple layouts and forget to support all of the views

        // findViewById can be null without warning
        findViewById<TextView>(R.id.tvGhost).text = "I'm a ghost"

        // synthetic can be null, but there is a warning
//         tvGhost.text = "I'm a ghost"

        // ViewBinding will error, so it can prevent us to delivery crashes
        // because of NullPointerException to the users
//         binding.tvGhost.text = "I'm a ghost"
    }

    // TODO another example: wrong import from the other module
}