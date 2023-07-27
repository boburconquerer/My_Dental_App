package com.example.myapplication.authorisation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.mainPageWithFragments.MainActivity

class RegistrationActivity : AppCompatActivity() {

    lateinit var buttonclick: Button
    lateinit var loginFromHere: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        initViews()

    }

    private fun initViews() {
        whenClicked()
        buttonClick()
    }

    private fun buttonClick() {
        buttonclick = findViewById(R.id.registration_button)

        buttonclick.setOnClickListener {
            var intent = Intent(this@RegistrationActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun whenClicked() {
        loginFromHere = findViewById(R.id.loginFromHere)

        loginFromHere.setOnClickListener {
            var intent = Intent(this@RegistrationActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}