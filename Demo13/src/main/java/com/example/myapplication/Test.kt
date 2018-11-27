package com.example.myapplication

/**
 * @ describe 在 Kotlin 中的一个类可以有一个主构造函数以及一个或多个次构造函数。主构造函数是类头的一部分：它跟在类名（与可选的类型参数）后。
 *
 * @author lzl
 *
 * @ time 2018/11/27 14:42
 *
 *
 */
//如果主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。
class Test(var string: String) {

    fun test() {
        print(string)
    }

    fun Test() {

    }

    fun Test(age: Int) {

    }
}

//主构造函数有可见性修饰符 constructor 关键字必须显示声明
class Foo private constructor(var string: String) {
    fun testFoo() {
        print(string)
    }
}