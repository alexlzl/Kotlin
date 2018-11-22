package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/22 15:24
 *
 *
 */
open class A(x: Int) {
    public open val y: Int = x
}

interface B {
    fun test():String
}

val ab: A = object : A(1), B {
    override fun test(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val y = 15
}