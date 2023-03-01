package com.example.phoneauthfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.phoneauthfirebase.databinding.ActivityPhoneBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth:FirebaseAuth
    private lateinit var signOutBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth=FirebaseAuth.getInstance()
        signOutBtn = findViewById(R.id.sign_out_btn)

        signOutBtn.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this,PhoneActivity::class.java))
        }





    }
}