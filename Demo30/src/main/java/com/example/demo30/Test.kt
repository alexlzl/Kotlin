package com.example.demo30

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2019/2/11 15:29
 *
 *
 */
//顶层变量
var name1 = "top var"

class Foo {
    /**
     * var 可以重新赋值
     */
    var name = "alex"
    var n1: String = "alex"
    /**
     * val 不可以重新赋值
     */
    val n2 = 100

    fun test(): Unit {
//        n2=200 报异常
        n1 = "new alex"
        name1="new=="
    }
}