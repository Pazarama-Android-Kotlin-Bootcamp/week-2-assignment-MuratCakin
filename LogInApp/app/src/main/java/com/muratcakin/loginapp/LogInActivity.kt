package com.muratcakin.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {


    // flag for visibility of password
    private var isVisibilityOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        ivShowHidePassword.setOnClickListener {
            isVisibilityOn = !isVisibilityOn
            showPassword(isVisibilityOn)
        }

        showPassword(isVisibilityOn)

    }

    // Show-Hide visibility of password
    private fun showPassword(isShow: Boolean) {
        if(isShow) {
            // to show the password
            etPassword.transformationMethod =HideReturnsTransformationMethod.getInstance()
            ivShowHidePassword.setImageResource(R.drawable.ic_baseline_visibility_off)
        }else {
            // to hide the password
            etPassword.transformationMethod =PasswordTransformationMethod.getInstance()
            ivShowHidePassword.setImageResource(R.drawable.ic_baseline_visibility)
        }
        // put the pointer at the end of the password string
        etPassword.setSelection(etPassword.text.toString().length)
    }



    fun signUp(view: View) {
        val intent = Intent(applicationContext, SignUpActivity::class.java)
        startActivity(intent)
    }
}