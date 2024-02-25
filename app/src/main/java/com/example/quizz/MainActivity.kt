package com.example.quizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bTrue: Button = findViewById(R.id.btn_true)
        val bFalse: Button = findViewById(R.id.btn_false)

        bTrue.setOnClickListener{
            Toast.makeText(
                this,"Bien hecho!!!",Toast.LENGTH_SHORT
            ).show()
        }
        bFalse.setOnClickListener{
            Toast.makeText(
                this,"Incorrecto!!!",Toast.LENGTH_SHORT
            ).show()
        }
    }
}