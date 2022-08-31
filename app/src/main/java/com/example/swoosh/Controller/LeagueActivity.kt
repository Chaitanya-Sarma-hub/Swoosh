package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.R

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        findViewById<ToggleButton>(R.id.womensLeagueButton).isChecked = false
        findViewById<ToggleButton>(R.id.coedLeagueButton).isChecked = false
        selectedLeague = "mens"
    }
    fun onCoedClicked(view: View) {
        findViewById<ToggleButton>(R.id.mensLeagueButton).isChecked = false
        findViewById<ToggleButton>(R.id.womensLeagueButton).isChecked = false
        selectedLeague = "co-ed"
    }
    fun onWomensClicked(view: View) {
        findViewById<ToggleButton>(R.id.mensLeagueButton).isChecked = false
        findViewById<ToggleButton>(R.id.coedLeagueButton).isChecked = false
        selectedLeague = "womens"
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }

}