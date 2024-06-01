package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Homepage1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h_page1)

        val imageButton: ImageButton = findViewById(R.id.button_heart)
        imageButton.setOnClickListener {
            val intent = Intent(this@Homepage1, Homepage2::class.java)
            startActivity(intent)
            finish()
        }
    }
}
