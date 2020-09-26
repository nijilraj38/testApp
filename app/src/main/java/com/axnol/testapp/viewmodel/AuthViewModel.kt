package com.axnol.testapp.viewmodel

import android.app.Application
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import com.axnol.testapp.`interface`.AuthListener
import com.axnol.testapp.repository.UserRepository

class AuthViewModel(application: Application):AndroidViewModel(application) {
    var email: String? =null
    var password: String? =null
    var authListener: AuthListener? =null


    fun onClickSignIn(view: View) {
    if (!email.isNullOrEmpty() || !password.isNullOrEmpty()) {
      val loginresponse = UserRepository().userLogin(email!!, password!!)

        Log.d("Bservice",loginresponse.toString())

    } else{


    }

    }


}