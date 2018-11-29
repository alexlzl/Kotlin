package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 15:06
 *
 *
 */

/**
 * 使用了val修饰的属性，不能有setter().
不管是val还是var修饰的属性，只要存在getter(),其值再也不会变化
使用var修饰的属性，可以省略掉getter(),不然setter()毫无意义。当然get() = field除外。而get() = field是Koltin默认的实现，是可以省略这句代码的
 */
class Mime1 {
    // size属性
    private val size = 0

    // 即isEmpty这个属性，是判断该类的size属性是否等于0
    val isEmpty: Boolean
        get() = this.size == 0

    // 另一个例子
    val num = 2
        get() = if (field > 5) 10 else 0
}

// 测试
fun main(args: Array<String>) {
    val mime = Mime1()
    println("isEmpty = ${mime.isEmpty}")
    println("num = ${mime.num}")
}

