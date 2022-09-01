package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.Model.Player
import com.example.swoosh.R


class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
    }

    fun onBeginnerClick(view: View) {
        findViewById<ToggleButton>(R.id.ballerSkillButton).isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClick(view: View) {
        findViewById<ToggleButton>(R.id.beginnerSkillButton).isChecked = false
        player.skill = "baller"
    }

    fun onFinishClick(view: View) {
        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please Select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}