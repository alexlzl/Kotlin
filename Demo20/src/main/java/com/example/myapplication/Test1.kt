package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 17:49
 *
 *
 */
/**
 * let操作符
let操作符的作用：当时用符号?.验证的时候忽略掉null
let的用法：变量?.let{ ... }
 */
fun Test() {
    val arrTest: Array<Int?> = arrayOf(1, 2, null, 3, null, 5, 6, null)

// 传统写法
    for (index in arrTest) {
        if (index == null) {
            continue
        }
        println("index => $index")
    }

// let写法
    for (index in arrTest) {
        index?.let { println("index => $it") }
    }


}

/**
 * Evils操作符

Evils其实不是一个操作符，而是evil的复数，而evil的意思在这里可以理解为屏蔽、安全的操作符，这样的操作符有三种：
?:  这个操作符表示在判断一个可空类型时，会返回一个我们自己设定好的默认值.
!!  这个操作符表示在判断一个可空类型时，会显示的抛出空引用异常（NullPointException）.
as? 这个操作符表示为安全的类型转换.
 */


/**
 * 分析：此操作符一般和?.操作符连用。当且仅当?:左边的表达式为null时，才会执行?:右边的表达式。
 */
fun test2() {
    val testStr: String? = null

    var length = 0

// 例： 当testStr不为空时，输出其长度，反之输出-1

// 传统写法
    length = if (testStr != null) testStr.length else -1

// ?: 写法
    length = testStr?.length ?: -1

    println(length)


}


/**
 * !!操作符
!!操作符可谓是给爱好空引用异常（NullPointException）的开发者使用，因为在使用一个可空类型变量时，在该变量后面加上!!操作符，会显示的抛出NullPointException异常
 */

fun test3(){
    val testStr : String? = null
    println(testStr!!.length)
}
