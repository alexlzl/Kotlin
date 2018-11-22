package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/22 10:44
 *
 *
 */
/**
 * 注意：对象声明不能在局部作用域（即直接嵌套在函数内部），但是它们可以嵌套到其他对象声明或非内部类中
 */
object TestObject {
    val name: String = "alex"
    fun getAge(): String {
        return "100"
    }

    fun test() {
        //异常
//        object T{
//
//        }
    }
}

/**
 * 类内部的对象声明可以用 companion 关键字标记：
 */
class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

/**
 * 该伴生对象的成员可通过只使用类名作为限定符来调用：
 */
val factory = MyClass.create()

/**
 * 可以省略伴生对象的名称，在这种情况下将使用默认名称 Companion：
 */
class Test {
    companion object {
        var name = "alex"
    }
    /**
     * 编译器报异常，伴生对象具有唯一性
     */
//    companion object Student {
//
//    }
}

var name = Test.name

var object1 = Test.Companion
var object2=Test