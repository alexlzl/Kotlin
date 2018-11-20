package com.example.myapplication

/**
 * @ describe  Kotlin 提供了使用指定的 接收者对象 调用函数字面值的功能。
 * 在函数字面值的函数体中，可以调用该接收者对象上的方法而无需任何额外的限定符。
 * 这类似于扩展函数，它允你在函数体内访问接收者对象的成员。
 *
 * @author lzl
 *
 * @ time 2018/11/20 17:40
 *
 *
 */

class TestM {
    fun main(args: Array<String>) {

        //类似扩展函数的用法，用实例对象来调用
        println(100.test6(2))//3
        println(1.test7(2))//3
    }

    /***
     *
     * 带有接受者的Lambda表达式
     *
     * 这里的函数类型是一个带有接受者的类型：
     *
     * test6:Int.(other:Int)->Int
     */
    var test6: Int.(other: Int) -> Int = { other -> other + 1 }
    /**
     * 带有接受者的匿名函数
     *
     * 用表达式表达式函数体：
     *
     * var test7=fun Int.(other:Int):Int=this+other
     *
     * 这里， 用代码块表示函数体，来声明一个匿名函数，最后赋给一个变量
     */
    var test7 = fun Int.(other: Int): Int {
        return this + other   //this是指向接受者的对象
    }

    fun Int.add():String{
        return "add"
    }

}