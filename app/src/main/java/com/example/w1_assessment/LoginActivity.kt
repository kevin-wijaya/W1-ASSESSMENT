package com.example.w1_assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Toast.makeText(this, "ini fitur login cuy", Toast.LENGTH_SHORT).show()
    }

    //Buat Menu Login
}