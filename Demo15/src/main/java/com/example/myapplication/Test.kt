package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/27 17:52
 *
 *
 */
/**
 * 覆盖规则

在 Kotlin 中，实现继承由下述规则规定：如果一个类从它的直接超类继承相同成员的多个实现，
它必须覆盖这个成员并提供为了表示采用从哪个超类型继承的实现其自己的实现（也许用继承来的其中之一）。
，我们使用由尖括号中超类型名限定的 super，如 super<Base>：
 */
open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // 接口成员默认就是“open”的

    fun b() {
        print("b")
    }

    fun c()
}

class C : A(), B {
    override fun c() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 编译器要求覆盖 f()：
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}