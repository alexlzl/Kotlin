package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 18:20
 *
 *
 */

/**
 * 2.3、as?操作符
其实这里是指as操作符，表示类型转换，如果不能正常转换的情况下使用as?操作符。
当使用as操作符的使用不能正常的转换的情况下会抛出类型转换（ClassCastException）异常，
而使用as?操作符则会返回null,但是不会抛出异常
 */
class Test3 {
    fun test() {
        // 会抛出ClassCastException异常
        val num1: Int? = "Koltin" as Int
        println("nun1 = $num1")
    }
}


/**
 * 这一章在实际的项目开发当中用到的地方是很多的，如果用好了各种空安全的操作符，估计你的项目中就不会抛出以及异常了，在这里我做了一个总结，希望会对各位有所帮助：

项目中会抛出空引用（NullPointerException）异常的情况
在可空类型变量的使用时，用了!!操作符
显式抛出空引用异常 throw NullPointerException()
外部 Java 代码导致的
对于初始化，有一些数据不一致(如一个未初始化的 this 用于构造函数的某个地方)
项目中会抛出类型转换（ClassCastException）异常的情况
在类型转换中使用了as操作符
使用了toXXX()方法不能转换的情况下
外部 Java 代码导致的
尽量避免使用的操作符
尽可能的不要使用!!操作符，多使用?:、?.操作符，以及let{}函数
尽可能的使用as?操作符去替换掉as,在不确定是否可以安全转换的情况下不使用toXXX()方法
 */
