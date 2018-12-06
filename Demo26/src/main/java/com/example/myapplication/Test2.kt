package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/6 14:57
 *
 *
 */
/**
 * 对象表达式和对象声明之间有一个重要的语义差别：
对象表达式是在使用他们的地方立即执行（及初始化）的
对象声明是在第一次被访问到时延迟初始化的
伴生对象的初始化是在相应的类被加载（解析）时，与 Java 静态初始化器的语义相匹配
 */
class Test2 {
    var name = "alex"

    companion object {
        @JvmField
        var age = 100
        @JvmStatic
        var num = 1
    }
}