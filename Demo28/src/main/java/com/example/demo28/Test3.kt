package com.example.demo28

import kotlin.reflect.KClass

/**
 * @ describe 与Java反射互操作(Interoperability Java Reflection)
 *
 * @author lzl
 *
 * @ time 2018/12/11 15:19
 *
 *
 */

//在Java平台上,标准库包含反射类的扩展,提供了与Java反射对象之间映射(参见kotlin.reflect.jvm包)
//1.获取与Kotlin属性对应的Java字段和get方法:
//import kotlin.reflect.jvm.*
class A(val p: Int)

fun main(args: Array<String>) {
    println(A::p.getter) // 输出 "public final int A.getP()"
    println(A::p)  // 输出 "private final int A.p"
}
//2.获取与Java类对应的Kotlin类,可用.kotlin扩展属性:
fun getKClass(o: Any): KClass<Any> =  o.javaClass.kotlin

