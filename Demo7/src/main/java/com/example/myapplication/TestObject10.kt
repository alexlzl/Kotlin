package com.example.myapplication

/**
 * @ describe 请注意，即使伴生对象的成员看起来像其他语言的静态成员，在运行时他们仍然是真实对象的实例成员，而且，例如还可以实现接口：
 *
 * 当然，在 JVM 平台，如果使用 @JvmStatic 注解，你可以将伴生对象的成员生成为真正的静态方法和字段
 *
 * 对象表达式和对象声明之间的语义差异

对象表达式和对象声明之间有一个重要的语义差别：

对象表达式是在使用他们的地方立即执行（及初始化）的；
对象声明是在第一次被访问到时延迟初始化的；
伴生对象的初始化是在相应的类被加载（解析）时，与 Java 静态初始化器的语义相匹配。
 *
 * @author lzl
 *
 * @ time 2018/11/22 18:31
 *
 *
 */
interface Factory<T> {
    fun create(): T
}

class MyClassF {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}

val f: Factory<MyClass> = MyClassF