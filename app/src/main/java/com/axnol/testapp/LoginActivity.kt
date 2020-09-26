package com.axnol.testapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import androidx.lifecycle.ViewModelProviders
import com.axnol.testapp.databinding.ActivityLoginBinding
import com.axnol.testapp.viewmodel.AuthViewModel

class LoginActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        val viewModel:AuthViewModel by viewModels()
        binding.viewmodel = viewModel





    }
}