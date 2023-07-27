package com.example.myapplication.authorisation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.myapplication.R

class SplashActivity : AppCompatActivity() {

    lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        initViews()
    }

    private fun initViews() {
        //time
        timer = object:CountDownTimer(1000,3000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                val intent = Intent(this@SplashActivity,RegistrationActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}