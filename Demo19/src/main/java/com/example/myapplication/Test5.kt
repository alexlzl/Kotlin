package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 15:41
 *
 *
 */
/**
 * 其特点：const只能修饰val，不能修饰var
声明常量的三种正确方式
在顶层声明
在object修饰的类中声明，在kotlin中称为对象声明，它相当于Java中一种形式的单例类
在伴生对象中声明
 */
// 1. 顶层声明
const val NUM_A: String = "顶层声明"

// 2. 在object修饰的类中
object TestConst {
    const val NUM_B = "object修饰的类中"
}

// 3. 伴生对象中
class TestClass {
    companion object {
        const val NUM_C = "伴生对象中声明"
    }
}

fun main(args: Array<String>) {
    println("NUM_A => $NUM_A")
    println("NUM_B => ${TestConst.NUM_B}")
    println("NUM_C => ${TestClass.NUM_C}")
}


