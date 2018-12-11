package com.example.demo28

/**
 * @ describe  .属性引用(Property References)
 *
 * @author lzl
 *
 * @ time 2018/12/11 15:24
 *
 *
 */
//在Kotlin中作为一级对象(first-class object)去访问属性,也可用::prop操作符:
var x = 1

fun main1(args: Array<String>) {
    println(::x.get()) // 输出 "1"
    ::x.set(2)
    println(x)         // 输出 "2"
    println(::x.name)  // 输出 "x"
}
//[表达式::x]的类型是KProperty<Int>,允许使用get()/set()读写值,或者使用name来获取属性名!
//对于可变属性var y = 1, ::y的类型是KMutableProperty<Int>,允许使用set()方法!

//属性引用可用在不需要参数的函数:
fun main2(args: Array<String>) {
    val strs = listOf("a", "bc", "def")
    println(strs.map(String::length)) // 输出 [1, 2, 3]
}

//访问类成员的属性,可用class::prop.get/set限定它:
class A1(val p: Int)

fun main3(args: Array<String>) {
    val prop = A1::p
    println(prop.get(A1(1))) // 输出 "1"
    println(A1::p.get(A1(1))) // 输出 "1"
}

//访问类的扩展属性,也可用class::prop.get/set限定它:
val String.lastChar: Char
    get() = this[length - 1]

fun main(args: Array<String>) {
    println(String::lastChar.get("abc")) // 输出 "c"
}

