package com.mhl.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegistrationActivity : AppCompatActivity() {
    private lateinit var confirmButton : Button
    private lateinit var numberText : EditText
    private lateinit var passwordText : EditText
    private lateinit var confirmText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        confirmButton = findViewById(R.id.confirm_button)
        numberText = findViewById(R.id.numberphone1)
        passwordText = findViewById(R.id.password1)
        confirmText = findViewById(R.id.reg_confirm)
        confirmButton.setOnClickListener {
            var intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }
    }
}