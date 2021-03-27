package com.example.myapplication2

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resuslt_page.*

class ResusltPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resuslt_page)

        val username = intent.getStringExtra(Constants.USER_NAME)
        val correctAnswers  = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val  totaQsns = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        entered_name.text = "Results for ${username}"
        score.text = "${correctAnswers} / ${totaQsns}"
        MediaPlayer.create(this, R.raw.results).start()

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
