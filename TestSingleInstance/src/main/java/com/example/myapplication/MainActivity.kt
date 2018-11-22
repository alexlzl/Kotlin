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

    fun  onClick(view : View){
        if(view is Button){
//            view as Button
            view .text=Single1.getName()
        }

    }

    fun onClick1(view:View){
        if(view is Button){
            view.text=Single2.getInstance().getName()
        }
    }

    fun onClick2(view: View){
        if(view is Button){
            view.text=Single3.getInstanc().getName()
        }
    }

    fun onClick3(view:View){
        if(view is Button){
         view.text=Single4.instance.getName()
        }
    }

    fun onClick4(view:View){
        if(view is Button){
            view.text=Single5.instance.getName()
        }
    }
}
