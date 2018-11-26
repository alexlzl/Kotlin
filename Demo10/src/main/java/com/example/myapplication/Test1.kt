package com.example.myapplication

import org.jetbrains.annotations.TestOnly

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/26 13:47
 *
 *
 */
annotation class Special(val why: String)


@Special("example")
class Foo(@Special("example") str: String) {}

/**
 * 如果需要对类的主构造函数进行注解，则需要在构造函数声明中添加 constructor 关键字 ，并将注解添加到其前面：
 */
class Foo1 @TestOnly constructor() {
}

/**
 * 主构造函数被类型限定符修饰，需要显示写出主构造函数名称
 */
open class Foo2 private constructor() {
    open fun Foo2() {}
    private fun Foo2(str: String) {}
}

/**
 * 主构造函数Private类型，不能被实例化
 */
//fun test(): Foo2 {
//    return Foo2()
//}