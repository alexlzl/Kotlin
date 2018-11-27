package com.example.myapplication

import org.jetbrains.annotations.TestOnly

/**
 * @ describe   主构造函数
 *
 * @author lzl
 *
 * @ time 2018/11/27 14:48
 *
 *
 */
class InitOrderDemo(name: String) {
    //Kotlin 中 双冒号操作符 表示把一个方法当做一个参数，传递到另一个方法中进行使用，通俗的来讲就是引用一个方法。先来看一下例子：
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    //请注意，主构造的参数可以在初始化块中使用。它们也可以在类体内声明的属性初始化器中使用：
    class Customer(name: String) {
        val customerKey = name.toUpperCase()
    }

    //如果构造函数有注解或可见性修饰符，这个 constructor 关键字是必需的，并且这些修饰符在它前面：
    class Customer1 public @TestOnly constructor(name: String) {}
}