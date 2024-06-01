package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoadingScr : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private lateinit var progressText: TextView
    private var progressStatus = 0
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        progressBar = findViewById(R.id.progressBar)
        progressText = findViewById(R.id.progressText)

        simulateLoading()
    }

    private fun simulateLoading() {
        Thread {
            while (progressStatus < 100) {
                progressStatus += 1

                handler.post {
                    progressBar.progress = progressStatus
                    progressText.text = "$progressStatus%"
                }

                try {
                    Thread.sleep(30)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }


            handler.post {
                val intent = Intent(this@LoadingScr, Onboarding1Scr::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}
