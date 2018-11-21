package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/20 18:49
 *
 *
 */

val printMsg = { msg: String ->
    println(msg)
}

fun main(args: Array<String>) {
    printMsg.invoke("hello")
}