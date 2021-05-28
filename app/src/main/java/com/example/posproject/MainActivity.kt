package com.example.posproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        intent = Intent(this,UserLoginActivity::class.java)
        startActivity(intent)

        /*intent = Intent (this,CreateNewUserActivity::class.java)
        startActivity(intent)

         */
    }
}