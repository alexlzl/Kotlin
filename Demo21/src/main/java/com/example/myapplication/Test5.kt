package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 14:53
 *
 *
 */

class Test5 {

    /**
     * 集合转数组==============
     */
    fun test() {
        fun listToArray() {
            val list = listOf<Int>(1, 2, 3, 4, 5, 6)         // 声明一个Int类型的List
            val listArray = list.toIntArray()           // 转换

            println(list.javaClass.toString())          // 打印list的类型
            println(listArray.javaClass.toString())     // 打印listArray的类型
            println(listArray[1])
        }


    }

    // 数组转集合
    fun arrayToList() {
        val arr = arrayOf(1, 3, 5, 7, 9)
        val list = arr.toList()
        println("变量arr的类型为：${arr.javaClass}")
        println("变量list的类型为：${list.javaClass}")
        println(list[1])
        var set=list.toSet()
    }

// 集合转集合，这里用Set转List

    fun listToList() {
        val set = setOf(1)
        val setTolist = set.toList()

        println("变量set的类型为：${set.javaClass}")
        println("变量setTolist的类型为：${setTolist.javaClass}")
        println(setTolist[0])
    }


}