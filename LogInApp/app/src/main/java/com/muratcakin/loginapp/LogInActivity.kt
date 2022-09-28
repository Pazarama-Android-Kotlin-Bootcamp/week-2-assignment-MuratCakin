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


    private fun showPassword(isShow: Boolean) {
        if(isShow) {
            etPassword.transformationMethod =HideReturnsTransformationMethod.getInstance()
            ivShowHidePassword.setImageResource(R.drawable.ic_baseline_visibility_off)
        }else {
            etPassword.transformationMethod =PasswordTransformationMethod.getInstance()
            ivShowHidePassword.setImageResource(R.drawable.ic_baseline_visibility)
        }
        etPassword.setSelection(etPassword.text.toString().length)
    }



    fun signUp(view: View) {
        val intent = Intent(applicationContext, SignUpActivity::class.java)
        startActivity(intent)
    }
}