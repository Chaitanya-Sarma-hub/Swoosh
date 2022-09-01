package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.swoosh.R

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        findViewById<Button>(R.id.getStartedButton).setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}