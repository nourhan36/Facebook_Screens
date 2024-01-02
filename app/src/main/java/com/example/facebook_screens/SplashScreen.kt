package com.example.facebook_screens

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        val intent = Intent(this, MainPage::class.java)

        Handler().postDelayed({
            startActivity(intent)
            finish()
        }, 2000)
    }
}