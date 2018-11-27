package com.example.myapplication

import org.jetbrains.annotations.TestOnly

/**
 * @ describe
 *  Kotlin 中使用关键字 class 声明类
 *  类声明由类名、类头（指定其类型参数、主构造函数等）以及由花括号包围的类体构成。类头与类体都是可选的； 如果一个类没有类体，可以省略花括号。
 *
 * @author lzl
 *
 * @ time 2018/11/27 11:26
 *
 *
 */

class Greeter1(var name1: String) {
    fun greet() {
        println("Hello, ${name1}");
    }
}
class Test1 {

}

//在没有权限修饰符，注解修饰的时候constructor 名称可以省略
class Test2( var  string: String) {
    fun test(){
        print(string)
    }

}

//类体省略,类头省略
class Test3
//权限修饰符出现，constructor要显示声明
class Test4 private constructor(str: String)

class Test5 @TestOnly constructor() {
    fun test() {
        print("ii")
    }
}

