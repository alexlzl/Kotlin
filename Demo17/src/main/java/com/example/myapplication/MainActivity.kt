package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun test1(view:View){
        if(view is Button){
           var v= TestData()
            v.name="add=======a8"
            view.text=v.name
            change()
            Test2().test()
        }
    }
}
