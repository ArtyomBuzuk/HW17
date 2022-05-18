package com.artyombuzuk.hw17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen3)
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity4::class.java))
            finish()
        }, 3000)
    }
}