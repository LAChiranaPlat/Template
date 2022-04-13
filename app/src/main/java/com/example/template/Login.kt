package com.example.template

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.example.template.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    lateinit var views:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views= ActivityLoginBinding.inflate(layoutInflater)

        setContentView(views.root)

        views.btnLog.setOnClickListener {

            startActivity(Intent(this,MainActivity::class.java))
            finish()

//            views.txtError.isVisible = true

        }
    }
}