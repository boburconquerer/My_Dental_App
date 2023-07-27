package com.example.myapplication.authorisation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.mainPageWithFragments.MainActivity

class LoginActivity : AppCompatActivity() {

    lateinit var buttonclick: Button
    lateinit var registrationFromHere: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()

    }

    private fun initViews() {
        whenClicked()
        buttonClick()
    }

    private fun whenClicked() {
        registrationFromHere = findViewById(R.id.registrationFromHere)

        registrationFromHere.setOnClickListener {
            val intent = Intent(this@LoginActivity,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun buttonClick() {
        buttonclick = findViewById(R.id.login_button)

        buttonclick.setOnClickListener {
            var intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}