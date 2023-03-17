package com.example.workinpara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EasyLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy_level)
    }
    fun backToChooseDifficult(view: View){
        finish()
    }
}