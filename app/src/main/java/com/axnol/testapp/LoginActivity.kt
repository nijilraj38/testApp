package com.axnol.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.axnol.testapp.`interface`.AuthListener
import com.axnol.testapp.databinding.ActivityLoginBinding
import com.axnol.testapp.viewmodel.AuthViewModel

class LoginActivity : AppCompatActivity() {
    //private val vendorSetupViewModel: AuthViewModel by activityViewModels<VendorSetupViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        val viewModel =
        binding.viewModel = AuthViewModel


    }
}