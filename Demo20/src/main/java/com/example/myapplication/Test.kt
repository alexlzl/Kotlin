package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 17:39
 *
 *
 */

/**
 * ?.这种符号去判断是否为null，在Kotlin中使用的地方是很多，特别是对于链式调用来说体验性更好。
 */
fun test() {
    val testStr: String? = null
    val result = testStr?.length?.plus(5)?.minus(10)
    println(result)
}