package com.example.workinpara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

    }
    fun backToMainFromDescip(view: View){
        finish()
    }
}