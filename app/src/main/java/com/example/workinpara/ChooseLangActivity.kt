package com.example.workinpara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChooseLangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_lang)
    }
    fun backToMain(view: View){
        finish()
    }
    fun goToChooseDifficult(view : View){
        var i= Intent(this, ChooseDifficultActivity::class.java)
        startActivity(i)
    }
}