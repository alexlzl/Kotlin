package com.example.myapplication

/**
 * @ describe 学习了Kotlin的小伙伴肯定知道,在Kotlin中类没有静态方法。
 *
 * 如果你需要写一个可以无需用一个类的实例来调用，但需要访问类内部的函数（例如，工厂方法,单例等），
 * 你可以把该类声明为一个对象。该对象与其他语言的静态成员是类似的。
 *
 * @author lzl
 *
 * @ time 2018/11/14 14:44
 *
 *
 */
//单例模式
object Single1 {
    fun getName(): String {
        return "alex"
    }
}