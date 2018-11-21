package com.example.myapplication

/**
 * @ describe  当然，我们都知道这段代码永远都只会输出yes。
这里只是为了演示，if 语句仍旧是一个闭包。而事实上，上文包括前文讲到的所有：函数、Lambda、if语句、for、when，都可以称之为闭包，但通常情况下，我们所说的闭包是 Lambda 表达式。
 *
 * @author lzl
 *
 * @ time 2018/11/20 18:36
 *
 *
 */
fun TestInfix.add():String{
    return  "testfix----add"
}
class Test {
    fun add() {

    }
}

fun main() {
    System.out.print(test1)
}

val test1 = if (5 > 3) {
    print("yes=============")
} else {
    print("no=============")
}