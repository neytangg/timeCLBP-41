package com.example.workinpara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChooseDifficultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_difficult)
    }
    fun backToChooseLang(view: View){
        finish()
    }
}