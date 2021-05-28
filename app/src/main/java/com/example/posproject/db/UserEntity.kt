package com.example.posproject.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_details")
data class UserEntity (
        @PrimaryKey(autoGenerate = false)
        val username : String,
        val password : String,
        val role : String


)
