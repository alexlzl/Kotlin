package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
fun Thread.add(){
    println("hello world")

}
class MainActivity : AppCompatActivity() {

//    var btn:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btn=findViewById(R.id.button1)
        button1.text="test"
    }

    fun test1(view : View){

    }


}
