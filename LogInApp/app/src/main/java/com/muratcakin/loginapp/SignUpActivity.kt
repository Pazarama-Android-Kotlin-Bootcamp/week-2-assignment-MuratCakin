package com.muratcakin.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun backToLogIn(view: View) {
        val intent = Intent(applicationContext, LogInActivity::class.java)
        startActivity(intent)
    }
}