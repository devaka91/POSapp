package com.example.posproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.example.posproject.db.POSdatabase
import com.example.posproject.db.UserEntity
import kotlinx.android.synthetic.main.activity_create_new_user.*

class CreateNewUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_user)





        btnSave.setOnClickListener {
            Toast.makeText(this,"done",Toast.LENGTH_SHORT).show()


        }



    }
}