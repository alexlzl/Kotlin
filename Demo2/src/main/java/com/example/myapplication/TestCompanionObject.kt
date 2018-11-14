package com.example.myapplication

import android.app.Activity

/**
 * @ describeKotlin中的static,Kotlin中并没有static关键字，但是有类似Java中的static的用法，话不多说，代码如下：

把要设计为相当于Java中static的方法用 companion object{}包裹起来就可以了
 *
 * @author lzl
 *
 * @ time 2018/11/14 13:48
 *
 *
 */
class TestCompanionObject {
    //用companion object包裹方法，实现java中static的效果
    companion object {
        fun testStatic(): String {
            return "testStatic====="
        }

        var staticstr: String = "static=====str"
    }

    /**
     * 学习了Kotlin的小伙伴肯定知道,在Kotlin中类没有静态方法。
     * 如果你需要写一个可以无需用一个类的实例来调用，
     * 但需要访问类内部的函数（例如，工厂方法,单例等），你可以把该类声明为一个对象。
     */
    object TestSingle {
        //用object修饰，相当于Java中的static，用object修饰一个变量，可以实现全局变量的效果
        var list: ArrayList<Activity>? = null
    }
}