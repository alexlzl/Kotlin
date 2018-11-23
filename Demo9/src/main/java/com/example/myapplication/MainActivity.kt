package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //二者等价的
        TestStatic.Companion.method()
        TestStatic.method()
    }

    fun test1(){
       var name= AnnotationTest.Companion.name
    }
}
