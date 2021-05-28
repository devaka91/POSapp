package com.example.posproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.posproject.db.UserEntityRepository


class UserViewModel (private val repository: UserEntityRepository): ViewModel() {

    val inputUsername = MutableLiveData<String>()
    val inputPassword = MutableLiveData<String>()


}