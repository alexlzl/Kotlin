package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val v = this infxa "aa"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(view: View) {
        main()
        Test().add()
    }

    fun test1(view: View) {
        if (view is Button) {
            view.text = TestInfix().resultInfix + TestInfix().add()
        }
    }

    /**
     * 这val map = mapOf(1 to "one", 2 to "two")里的to就是一个infix function。其源码实现：public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
    　　调用方式有两种：
    　　1.to("one"):常规调用方式
    　　1 to "one：中缀表示法调用
     */
    fun test2(view: View) {
        val map = mapOf(1 to "one", 2 to "two")
        map.map(::println)
    }
}
