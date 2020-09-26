package com.axnol.testapp.viewmodel

import android.view.View
import com.axnol.testapp.`interface`.AuthListener
import com.axnol.testapp.repository.UserRepository

class AuthViewModel {
    var email: String? =null
    var password: String? =null
    var authListener: AuthListener? =null


    fun onClickSignIn(view: View) {
    if (!email.isNullOrEmpty() || !password.isNullOrEmpty()) {
      val loginresponse = UserRepository().userLogin(email!!, password!!)
        authListener?.onSuccess()

    } else {
authListener?.onFailure("error")    }

    }


}