package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val v=this infxa "aa"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(view:View){
        main()
        Test().add()
    }

    fun test1(view:View){
           if(view is Button){
               view.text=TestInfix().resultInfix+TestInfix().add()
           }
    }
}
