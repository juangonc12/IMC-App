package com.example.androidbegginer.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.androidbegginer.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val button = findViewById<AppCompatButton>(R.id.button)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        button.setOnClickListener {

            val name = etName.text.toString()

            if (name.isNotEmpty()){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("Pglo", name)
                startActivity(intent)
            }

        }
    }
}
