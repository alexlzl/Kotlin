package com.example.demo28

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test1(view: View) {
        if (view is Button) {
//            Test().test()
//            view.text=Test1()::name.get()
//            view.text=Test1().name
//            view.text=Test1().test1()
            //绑定函数引用,m存储的是绑定的函数引用
//            val m = Test1()::test2
//            val s = m("d")
//            view.text=   Test1().test2("dd")
//            val ss = { str: String -> Test1().test2(str) }
//            view.text = s
//            view.text=Test1()::test1.name


            Test6().test(Person())
        }

    }
}
