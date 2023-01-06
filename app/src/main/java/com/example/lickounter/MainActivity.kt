package com.example.lickounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val increaseBtn = findViewById<AppCompatButton>(R.id.button_increase)
        increaseBtn.setOnClickListener { increment() }
        val resetBtn = findViewById<AppCompatButton>(R.id.button_reset)
        resetBtn.setOnClickListener { reset() }
    }

    private fun increment() {
        val counterView = findViewById<TextView>(R.id.counter)
        var counter = counterView.text.toString().toInt()
        counter++
        counterView.text = counter.toString()
    }

    private fun reset() {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("count", findViewById<TextView>(R.id.counter).text.toString())
        startActivity(intent)
    }


}