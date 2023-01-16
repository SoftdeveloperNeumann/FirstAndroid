package com.example.firstandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroid.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.* geht nicht mehr

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // jetz in neuer Form, dem ViewBinding
        // zuerst im Gradle bekannt machen
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnCopy.setOnClickListener { 
            binding.tvOutput.text = binding.etInput.text
        }

        //setContentView(R.layout.activity_main)

//        val input = findViewById<EditText>(R.id.et_input)
//        val output = findViewById<TextView>(R.id.tv_output)
//        val btn = findViewById<Button>(R.id.btn_copy)
//
//        btn.setOnClickListener {
//            output.text = input.text
//        }


    }
}