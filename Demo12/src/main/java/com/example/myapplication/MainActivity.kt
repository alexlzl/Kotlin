package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //对应生成的java代码调用的是geName方法，name属性在生成的java代码中是private类型
        var name = Test4().name
    }
}
