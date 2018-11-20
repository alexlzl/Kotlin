package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/20 11:15
 *
 *
 */
class KotlinLambda {
    var name = "alex"
    var age: Int = 100

    fun test() {
        /**
         * Lambda 表达式语法
         * Lambda 表达式的完整语法形式如下：
         */
        val sum = { x: Int, y: Int -> x + y }
    }

    fun test1() {
        /**
         *  lambda 表达式总是括在花括号中， 完整语法形式的参数声明放在花括号内，并有可选的类型标注，
         *  函数体跟在一个 -> 符号之后。如果推断出的该 lambda 的返回类型不是 Unit，那么该 lambda 主体中的最后一个（或可能是单个）表达式会视为返回值。
         *  如果我们把所有可选标注都留下，看起来如下：
         */
        val sum: (Int, Int) -> Int = { x, y -> x + y }
    }

    fun test2() {
        //在 Kotlin 中有一个约定：如果函数的最后一个参数接受函数，那么作为相应参数传入的 lambda 表达式可以放在圆括号之外：
        //val product = items.fold(1) { acc, e -> acc * e }

        //如果该 lambda 表达式是调用时唯一的参数，那么圆括号可以完全省略：
        run { println("...") }
    }

    fun test3() {
//        it：单个参数的隐式名称
//
//        一个 lambda 表达式只有一个参数是很常见的。
//
//        如果编译器自己可以识别出签名，也可以不用声明唯一的参数并忽略 ->。 该参数会隐式声明为 it：
//        ints.filter { it > 0 } // 这个字面值是“(it: Int) -> Boolean”类型的
    }
}