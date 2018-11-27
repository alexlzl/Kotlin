package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/27 18:39
 *
 *
 */
/**
 * 内部类没有标记为inner不能访问外部bar变量
 */
class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 100
    }
}

val demo = Outer.Nested().foo() // == 2

/**
 * 类可以标记为 inner 以便能够访问外部类的成员。内部类会带有一个对外部类的对象的引用：
 */
class OuterO {
    private val bar: Int = 1
    inner class Inner {
        fun foo() ={ bar}
    }
}

val demo1 = OuterO().Inner().foo() // == 1