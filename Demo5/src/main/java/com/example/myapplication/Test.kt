package com.example.myapplication

/**
 * @ describe  这个函数刚好与takeIf筛选逻辑恰好相反。即：如果符合条件返回null，不符合条件返回对象本身
 *
 * @author lzl
 *
 * @ time 2018/11/19 11:52
 *
 *
 */

fun main(args: Array<String>) {
    val arr = listOf(1, 2, 3)
    arr.forEach {
        println("$it % 2 == 0 => ${it.takeIf { it % 2 == 0 }}")
    }
}