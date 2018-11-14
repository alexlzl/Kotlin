package com.example.myapplication

/**
 * @ describe 学习了Kotlin的小伙伴肯定知道,在Kotlin中类没有静态方法。
 *
 * 如果你需要写一个可以无需用一个类的实例来调用，但需要访问类内部的函数（例如，工厂方法,单例等），
 * 你可以把该类声明为一个对象。该对象与其他语言的静态成员是类似的。
 *
 *
 * object类型的单例模式，本质上是饿汉式加载，即在类加载的时候创建单例。它可能存在的问题有
   如果构造方法中存在过多的处理，会导致加载这个类时比较慢，可能引起性能问题。
   如果使用饿汉式的话，只进行了类的装载，并没有实质的调用，会造成资源的浪费。
 * @author lzl
 *
 * @ time 2018/11/14 14:44
 *
 *
 */
//单例模式===饿汉式
object Single1 {
    fun getName(): String {
        return "alex"
    }
}