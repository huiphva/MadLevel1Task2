package com.example.madlevel1task2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    // Initiate view
    private fun initViews() {
        btnSolve.setOnClickListener { onBtnSolve() }
        updateUI()
    }

    private fun updateUI() {

    }

    private fun onBtnSolve() {
        var correctCounter: Int = 0 // Counts correct answers

        var top = tvTop.text.toString()
        var midTop = tvMidTop.text.toString()
        var midBot = tvMidBot.text.toString()
        var bot = tvBot.text.toString()


        if (top == "T") {
            correctCounter++;
        }
        if (midTop == "F") {
            correctCounter++;
        }
        if (midBot == "F") {
            correctCounter++;
        }
        if (bot == "F") {
            correctCounter++;
        }

        Toast.makeText(this, "The correct number of answers is: " + correctCounter, Toast.LENGTH_SHORT).show()

    }

}
