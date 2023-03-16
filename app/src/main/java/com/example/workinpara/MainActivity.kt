package com.example.workinpara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.workinpara.databinding.ActivityMainBinding
import com.example.workinpara.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    lateinit var bindingM : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingM=inflate(layoutInflater)
        setContentView(bindingM.root)
    }

    fun goToChooseLang(view : View){
        var i=Intent(this, ChooseLangActivity::class.java)
        startActivity(i)
    }

    fun goToDescription(view : View){
        var i=Intent(this, DescriptionActivity::class.java)
        startActivity(i)
    }


}