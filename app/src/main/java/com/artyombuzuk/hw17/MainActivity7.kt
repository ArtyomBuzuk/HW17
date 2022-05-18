package com.artyombuzuk.hw17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen7)
        var button: Button = findViewById<Button>(R.id.buttonScreen7)
        button?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        var textView: TextView = findViewById<TextView>(R.id.textViewScreen7)
        textView?.setOnClickListener{
            val intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)
            finish()
        }
    }
}