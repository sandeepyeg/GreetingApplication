package com.example.greetingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textTaken:EditText = findViewById(R.id.editText)
        val buttonGreet:Button = findViewById(R.id.buttonGreet)

        buttonGreet.setOnClickListener {
            val textToToast = textTaken.text.toString()
            Toast.makeText(applicationContext, "Hello $textToToast", Toast.LENGTH_LONG).show()

        }


    }
}