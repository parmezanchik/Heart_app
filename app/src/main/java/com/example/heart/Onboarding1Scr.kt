package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Onboarding1Scr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val imageButton: ImageButton = findViewById(R.id.button_start)
        imageButton.setOnClickListener {
            val intent = Intent(this@Onboarding1Scr, Onboarding2Scr::class.java)
            startActivity(intent)
            finish()
        }
    }
}
