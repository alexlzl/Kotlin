package com.example.liuzhouliang.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    private var bird=Bird("name",100)
    private var btn:Button?=null
    lateinit var value: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button) as Button
        test()
    }

    private fun test() {
        button!!.setOnClickListener { Toast.makeText(this@MainActivity, "test"+bird.sexName, Toast.LENGTH_SHORT).show() }
//        button!!.setOnClickListener { v -> Toast.makeText(this@MainActivity, "test", Toast.LENGTH_SHORT).show() }
    }


     fun test1(){
         val list = arrayListOf(1,2,3,4)
         val list1=ArrayList<String>()
         list.add(5)
         list.remove(3)
         for(item in list){
             println(item)
         }
    }
}
