package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Onboarding3Scr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val imageButton: ImageButton = findViewById(R.id.button_start)
        imageButton.setOnClickListener {
            val intent = Intent(this@Onboarding3Scr, Homepage1::class.java)
            startActivity(intent)
            finish()
        }
    }
}
