package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/6 10:50
 *
 *
 */

/**
 * 请注意，匿名对象可以用作只在本地和私有作用域中声明的类型。
 * 如果你使用匿名对象作为公有函数的 返回类型或者用作公有属性的类型，那么该函数或属性的实际类型
 * 会是匿名对象声明的超类型，如果你没有声明任何超类型，就会是 Any。在匿名对象 中添加的成员将无法访问。
 */
class C {

    private fun foo(): Any {
        return object {
            val x: String = "x"
        }
    }

   private val ob=object {
        var a="alex"
    }

    //对象表达式========================
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo1() = object {
        val x: String = "xx"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo1().x     // 没问题
//        val x2 = publicFoo().x  // 错误：未能解析的引用“x”
        var a=ob.a
    }
}


