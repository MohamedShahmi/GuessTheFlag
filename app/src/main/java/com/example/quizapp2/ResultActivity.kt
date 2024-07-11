package com.example.quizapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username

        val totalQ = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANS, 0)

        tv_score.text = "Your Score is $correctAns out of $totalQ"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}