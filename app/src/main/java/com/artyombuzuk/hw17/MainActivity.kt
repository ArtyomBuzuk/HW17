package com.artyombuzuk.hw17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button: Button = findViewById<Button>(R.id.buttonScreen1)
        button?.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        var textView:TextView = findViewById<TextView>(R.id.textViewScreen1)
        textView?.setOnClickListener{
            val intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)
            finish()
        }
    }
}