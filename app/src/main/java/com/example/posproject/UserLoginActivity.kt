package com.example.posproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_user_login.*

class UserLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)


        btnSave.setOnClickListener{
            Toast.makeText(this,"Clicked", Toast.LENGTH_SHORT).show()


        }



    }
}