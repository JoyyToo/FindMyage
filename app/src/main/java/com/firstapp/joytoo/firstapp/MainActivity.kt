package com.firstapp.joytoo.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buFindAge(view:View) {
        // fire when button is clicked
        // convert to string first coz the input fields is for text
        // id.event name
        val yob:Int = txtYOB.text.toString().toInt()
        if (yob==0){
            tvShowAge.text = "Invalid  input"
            return
        }
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = currentYear - yob
        tvShowAge.text = "You are $myAge years old"
    }
}
