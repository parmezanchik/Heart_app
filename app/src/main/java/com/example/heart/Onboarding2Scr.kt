package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Onboarding2Scr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val imageButton: ImageButton = findViewById(R.id.button_cont)
        imageButton.setOnClickListener {
            val intent = Intent(this@Onboarding2Scr, Onboarding3Scr::class.java)
            startActivity(intent)
            finish()
        }
    }
}
