package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Homepage2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h_page2)

        val Button: Button = findViewById(R.id.button_n)
        Button.setOnClickListener {
            val intent = Intent(this@Homepage2, Homepage3::class.java)
            startActivity(intent)
            finish()
        }
    }
}
