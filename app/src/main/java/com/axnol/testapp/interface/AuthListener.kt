package com.axnol.testapp.`interface`

interface AuthListener {


    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}