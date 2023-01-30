package com.kudu.splitshare.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.kudu.splitshare.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //btn sign up
        binding.btnSignUp.setOnClickListener {
            Toast.makeText(this, "Sign Up clicked", Toast.LENGTH_SHORT).show()
        }

        //btn sign in
        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

        //btn sign in google
        binding.btnSignInGoogle.setOnClickListener {
            Toast.makeText(this, "Sign in with Google clicked", Toast.LENGTH_SHORT).show()
        }
    }
}