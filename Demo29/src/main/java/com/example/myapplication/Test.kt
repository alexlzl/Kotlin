package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/12 11:49
 *
 *
 */
class Test :MainActivity(){
    /**
     * 遍历元素
     */
    fun test1() {
        val array = arrayOf(1, 2, 3, 5)
        for (item in array) {
            System.out.println("遍历输出==$item")
        }
    }

    /**
     * 输出数组下标
     */
    fun test2() {
        val array = arrayOf(1, 2, 3, 4)
        for (item in array.indices) {
            System.out.println("$item")
        }
    }

    /**
     * 输出下标和元素
     */
    fun test3() {
        val array = arrayOf(2, 1, 3, 4)
        array[0] = 100
        for ((item, item1) in array.withIndex()) {
            println("下标=$item----元素=$item1")
        }
    }

    /**
     * 要创建一个不包含末尾元素的区间：
     */
    fun test4() {
        for (item in 1 until 10) {
            println(item)//输出1..9
        }
    }

    /**
     * 遍历某个范围内的数据
     */
    fun test5() {
        for (item in 1..10) {
            println(item)
        }
    }

    fun test6() {
        println("test6")
        for (item in 1 downTo 10) {

            println("==$item")
        }
    }

    /**
     * 想不使用1作为遍历的步长，可以使用step()函数：
     *
     * I/System.out: 1
    I/System.out: 3
    I/System.out: 5
    I/System.out: 7
    I/System.out: 9

     */
    fun test7() {
        for (index in 1..10 step 2) {
            println(index)//会输出1..3..5......
        }
    }

    fun test8(){
        for (index in 1 until 10){
            println(index)//输出0..9
        }
        val array= arrayOf(1,2,3)
        for(item in array ){
            println(item)
        }
    }

}