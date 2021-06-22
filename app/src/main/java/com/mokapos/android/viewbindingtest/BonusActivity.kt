package com.mokapos.android.viewbindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.mokapos.android.viewbindingtest.databinding.ActivityBonusBinding
import kotlinx.android.synthetic.main.activity_bonus.*

/**
 * Only crazy people will do this
 * Combining findViewById, ViewBinding and kotlin synthetic in one Activity
 */
class BonusActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvHelloWorld: TextView
    private lateinit var binding: ActivityBonusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBonusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvHelloWorld = binding.tvHelloWorld

        findViewById<TextView>(R.id.bChangeWithFindViewById).setOnClickListener(this)
        binding.bChangeWithViewBinding.setOnClickListener(this)
        bChangeWithSynthetic.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.bChangeWithFindViewById -> {
                findViewById<TextView>(R.id.tvHelloWorld).text =
                    findViewById<EditText>(R.id.etHelloWorld).text
            }
            R.id.bChangeWithViewBinding -> {
                binding.tvHelloWorld.text =
                    binding.etHelloWorld.text
            }
            R.id.bChangeWithSynthetic -> {
                tvHelloWorld.text =
                    etHelloWorld.text
            }
        }
    }
}