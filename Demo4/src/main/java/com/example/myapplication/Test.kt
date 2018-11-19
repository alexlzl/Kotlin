package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/16 16:23
 *
 *
 */
class Test<T>(t:T) {

    fun <M> test1(m:M){

    }

    interface Source<out T> {
        fun nextT(): T
    }

    fun demo(strs: Source<String>) {
        var objects: Source<Any> = strs // 这个没问题，因为 T 是一个 out-参数
        // ……
    }
}