package com.example.myapplication

import org.jetbrains.annotations.TestOnly

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 15:15
 *
 *
 */
/**
 * 如果，属性访问器的可见性修改为private或者该属性直接使用private修饰时，我们只能手动提供一个公有的函数去修改其属性了。就像Java中的Bean的setXXXX()
 */
lateinit var name:String
 var str1 = "kotlin_1"
    private set         // setter()访问器的私有化，并且它拥有kotlin的默认实现

var test: String? = null
    @TestOnly set         // 用`Inject`注解去实现`setter()`

val str2 = "kotlin_2"
//    private set         // 编译错误，因为val修饰的属性，不能有setter

var str3 = "kotlin_3"
//    private get         // 编译出错，因为不能有getter()的访问器可见性

fun main(args: Array<String>) {
    // 这里伪代码
    str1 = "能不能重新赋值呢？"     // 编译出错，因为上面的setter是私有的
}

/**
 * 在开发中，难免会遇到一些已经确定的值的量。在Java中，我们可以称其为常量。在kotlin中，我们称其为编译时常数。我们可以用const关键字去声明它。其通常和val修饰符连用
关键字：const
满足const的三个条件：

对象的顶层或成员，即顶层声明。
初始化为String类型或基本类型的值
没有定制的getter()
 */
const val CONST_NUM = 5
const val CONST_STR = "Kotlin"

class Test4 {
    lateinit var name:String
}