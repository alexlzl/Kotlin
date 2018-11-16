package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button


class MainActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(view: View) {
        if (view is Button) {
            //D.foo in C
            C().caller(D1())
            view.text= TestM().add()
        }
    }

}

/**
 * 给TestM扩展一个add方法
 */
fun TestM.add():String{
    return "alex"
}
