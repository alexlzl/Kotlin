package com.example.myapplication

/**
 * @ describe  对象表达式定义
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
    fun test(): String
}

/**
 * 就像 Java 匿名内部类一样，对象表达式中的代码可以访问来自包含它的作用域的变量。 （与 Java 不同的是，这不仅限于 final 变量。）
 *
 * 对象表达式和对象声明之间的语义差异

对象表达式和对象声明之间有一个重要的语义差别：

对象表达式是在使用他们的地方立即执行（及初始化）的；
对象声明是在第一次被访问到时延迟初始化的；
伴生对象的初始化是在相应的类被加载（解析）时，与 Java 静态初始化器的语义相匹配。
 */
var i = 100
val ab: A = object : A(1), B {
    override fun test(): String {
        i++
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val y = 15
}