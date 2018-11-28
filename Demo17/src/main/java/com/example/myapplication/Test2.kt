package com.example.myapplication

/**
 * @ describe 标准库提供了 Pair 和 Triple。尽管在很多情况下命名数据类是更好的设计选择， 因为它们通过为属性提供有意义的名称使代码更具可读性。
其实这两个类的源码部分不多，故而贴出这个类的源代码来分析分析
 *
 * @author lzl
 *
 * @ time 2018/11/28 16:21
 *
 *
 */

class Test2 {
    /**
    I/System.out: (1, 2) 	 (1, 2, 3)
    I/System.out: [1, 2]
    I/System.out: [1, 2, 3]
    I/System.out: ((1, 2), 3)
     */
    fun test() {
        val pair = Pair(1, 2)        // 实例
        val triple = Triple(1, 2, 3)  // 实例
        println("$pair \t $triple") // 打印：即调用了各自的toString()方法
        println(pair.toList())      // 转换成List集合
        println(triple.toList())    // 转换成List集合
        println(pair.to(3))         // Pair类特有: 其作用是把参数Pair类中的第二个参数替换
    }
}