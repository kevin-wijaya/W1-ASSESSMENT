package com.example.w1_assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LeaderboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        for (a in 1 .. 10){
            Toast.makeText(this, "$a", Toast.LENGTH_SHORT).show()
        }
    }
}