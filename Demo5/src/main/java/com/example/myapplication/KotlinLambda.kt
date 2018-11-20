package com.example.myapplication

/**
 * @ describe Lambda表达式用法
 *
 * @author lzl
 *
 * @ time 2018/11/20 11:15
 *
 *
 */
/**
 * 全局函数
 */
fun test0() {

}

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

    fun test4() {

        /**
         * 从 lambda 表达式中返回一个值
        我们可以使用限定的返回语法从 lambda 显式返回一个值。 否则，将隐式返回最后一个表达式的值。
        因此，以下两个片段是等价的：
        ints.filter {
        val shouldFilter = it > 0
        shouldFilter
        }
        ​
        ints.filter {
        val shouldFilter = it > 0
        return@filter shouldFilter
        }
        这一约定连同在圆括号外传递 lambda 表达式一起支持 LINQ-风格 的代码：
        strings.filter { it.length == 5 }.sortedBy { it }.map { it.toUpperCase() }
         */
    }

    fun test5() {
        /**
         * 下划线用于未使用的变量（自 1.1 起）
         * 如果 lambda 表达式的参数未使用，那么可以用下划线取代其名称：
         * map.forEach { _, value -> println("$value!") }
         */
    }

    fun main(args: Array<String>) {

        println(test3(1, 2))
        println(test4(1, 2))
        println(test5(1, 2))
    }

    /**
     * 匿名函数，没有名字，其他语法和常规函数类似
     *
     * 声明一个匿名函数，这里用表达式来表示函数体
     */
    var test3 = fun(x: Int, y: Int): Int = x + y
    /**
     * 声明一个匿名函数，这里用代码块来表示函数体
     */
    var test4 = fun(x: Int, y: Int): Int {
        return x + y
    }
    /**
     * 声明一个匿名函数，当返回值类型可以推断出，可以省略
     */
    var test5 = fun(x: Int, y: Int) = x + y
    /**
     * 匿名函数，没有名字，其他语法和常规函数类似,例如：当返回值类型可以推断出，可以省略
     */
    var test2 = fun(x: String): String {
        return "name"
    }

    /**
     * 除了以上提到的显式指定函数的返回类型区别外，Lambda表达式和匿名函数的另外一个区别：

    一个不带标签的 return 语句 总是在用 fun 关键字声明的函数中返回。这意味着 lambda 表达式中的 return 将从包含它的函数返回，而匿名函数中的 return 将从匿名函数自身返回。
     */

    fun test6() {
        /**
         * 局部函数
         */
        fun test7() {

        }
        fun test71(){

        }
    }

    fun test7(){
        test6()

    }

}