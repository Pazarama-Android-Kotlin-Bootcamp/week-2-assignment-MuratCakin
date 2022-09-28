package com.muratcakin.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class LogInActivity : AppCompatActivity() {


    private lateinit var ivChangePasswordVisibility: ImageView
    private var isVisibilityOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        ivChangePasswordVisibility  = findViewById(R.id.ivShowPassword)

        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility)
                isVisibilityOn = false
            } else {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off)
                isVisibilityOn = true
            }
        }
    }


    fun signUp(view: View) {
        val intent = Intent(applicationContext, SignUpActivity::class.java)
        startActivity(intent)
    }
}