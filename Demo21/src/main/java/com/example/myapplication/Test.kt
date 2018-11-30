package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 10:40
 *
 *
 */
class Test {
    /**
     * 数组处理=========
     *
     * 这里只介绍几个常用的方法。其实在文章的后面，也对这些方法做出了讲解。
    用arr[index]的获取元素。
    用arr.component1() ... arr.component5()获取数组的前5个元素。同样适用与集合。
    用arr.reverse()反转元素。
    至于其他处理的元素，在文章的尾部都有说明。这也是我把数组类型与集合类型放在同一文章讲解的原因。
     */
    fun test1() {
        val list = arrayListOf("a", "b")
        val arr = arrayOf("1", 2, 3, 4, "5", 6)

        println(arr.component1())
        println(arr.component3())
        println(arr.component5())

        // 文章后面会讲解forEach高阶函数。比for循环简洁多了
        for (index in arr) {
            println("输出数组" + "$index \t")
        }

        for (index in list) {
            println("输出集合"+"$index")
        }
    }
}