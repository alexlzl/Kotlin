package com.example.myapplication

import android.view.View

/**
 * @ describe 就像 Java 匿名内部类一样，对象表达式中的代码可以访问来自包含它的作用域的变量。 （与 Java 不同的是，这不仅限于 final 变量。）
 *
 * @author lzl
 *
 * @ time 2018/11/22 16:46
 *
 *
 */


fun countClicks(view: View) {
    var clickCount = 0
    var enterCount = 0
    view.setOnClickListener {
        clickCount++
    }

    view.setOnClickListener(object : View.OnClickListener {
        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    })

}