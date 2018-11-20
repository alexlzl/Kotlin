package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/19 15:38
 *
 *
 */
class Test1 {
    fun main() {
        foo1(this::bar1)
    }

    fun foo1(body: () -> Unit) {
        body()
    }

    fun bar1() {
        println("bar1========")
    }
}