package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/19 13:47
 *
 *
 */
class TestRepeat {
    fun test() {
        /**
         * 调用repeat方法=========
         * kotlin中函数最后一个参数是Lambda表达式可以提取到"()"外面，于是变成了这样
         *
         * 这里我们来说下it这个关键字，当一个 lambda 表达式只有一个参数的时候，你可以在你的代码中将其省略，并用 it 代替 ,这是一个很有用的特性
         */
        repeat(3) {
            println("Just repeat, index: $it")
        }


    }

    fun test1(): String = "test"
    fun test2(): String {
        println("abc")
        return "test"
    }


}