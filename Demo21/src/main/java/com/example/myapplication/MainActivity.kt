package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test1(view:View){
        Test().test1()
    }


    fun test2(view:View){
        Test4().test()
    }


    fun test3(view :View){
        Test4().test1()
    }
}
