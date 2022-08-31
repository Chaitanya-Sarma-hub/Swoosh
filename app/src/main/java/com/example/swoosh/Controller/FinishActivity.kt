package com.example.swoosh.Controller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.EXTRA_SKILL
import com.example.swoosh.R

class FinishActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        val skill = intent.getStringExtra(EXTRA_SKILL).toString()

        findViewById<TextView>(R.id.searchLeaguesText).text = "Looking for $league $skill near you..."
    }
}