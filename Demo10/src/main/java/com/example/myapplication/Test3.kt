package com.example.myapplication

import kotlin.reflect.KClass

/**
 * @ describe  注解参数使用
 *
 * 允许的参数类型有：
对应于 Java 原生类型的类型（Int、 Long等）；
字符串；
类（Foo::class）；
枚举；
其他注解；
上面已列类型的数组。
注解参数不能有可空类型，因为 JVM 不支持将 null 作为注解属性的值存储。
如果注解用作另一个注解的参数，则其名称不以 @ 字符为前缀：
 *
 *
 *
 * @author lzl
 *
 * @ time 2018/11/26 14:52
 *
 *
 */

annotation class ReplaceWith(val expression: String)

/**
 * 注解第二个参数是注解类型ReplaceWith，其名称不以 @ 字符为前缀
 */
annotation class Deprecated(
        val message: String,
        val replaceWith: ReplaceWith = ReplaceWith(""))

@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))
class Test3 {}




/**
 * 如果需要将一个类指定为注解的参数，请使用 Kotlin 类 （KClass）。Kotlin 编译器会自动将其转换为 Java 类，以便 Java 代码能够正常看到该注解及参数 。
 */
annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)

@Ann(String::class, Int::class)
class MyClass



annotation class Suspendable

/**
 * Lambda 表达式
 * 注解也可以用于 lambda 表达式。它们会被应用于生成 lambda 表达式体的 invoke() 方法上。这对于像 Quasar 这样的框架很有用， 该框架使用注解进行并发控制。
 */
val f = @Suspendable { it:String ->println(it) }
val f1 = @Suspendable { println("=====") }

fun test(){
    f("dd==========")
}

