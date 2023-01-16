package com.example.firstandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.et_input)
        val output = findViewById<TextView>(R.id.tv_output)
        val btn = findViewById<Button>(R.id.btn_copy)

        btn.setOnClickListener {
            output.text = input.text
        }
    }
}