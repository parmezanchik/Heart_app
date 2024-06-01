package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ResultScr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val imageButton: ImageButton = findViewById(R.id.button_ready)
        imageButton.setOnClickListener {
            val intent = Intent(this@ResultScr, Homepage2::class.java)
            startActivity(intent)
            finish()
        }
    }
}
