package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/5 18:17
 *
 *
 */
/**
 * 在主构造函数中重写
 *
 * 此处需要在主构造函数中重写valStr 字符串,override 关键字必须要，因为在父类中也存在valStr字符串
 */
class DemoTest2(  var num: Int, override val valStr: String) : Demo()

fun test2(){
    val demo2 = DemoTest2(1,"构造函数中重写")
    println("num = ${demo2.num} \t valStr = ${demo2.valStr}")
}