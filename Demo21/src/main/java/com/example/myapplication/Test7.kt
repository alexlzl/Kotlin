package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 15:38
 *
 *
 */
/**
 * filter{...} : 把不满足条件的元素过滤掉
filterIndexed{...} : 和filter{}函数作用类似，只是可以操作集合中元素的下标（index）
filterNot{...} : 和filter{}函数的作用相反
filterNotNull() : 过滤掉集合中为null的元素。
take(num) : 返回集合中前num个元素组成的集合
takeWhile{...} : 循环遍历集合，从第一个元素开始遍历集合，当第一个出现不满足条件元素的时候，退出遍历。然后把满足条件所有元素组成的集合返回。
takeLast(num) : 返回集合中后num个元素组成的集合
takeLastWhile{...} : 循环遍历集合，从最后一个元素开始遍历集合，当第一个出现不满足条件元素的时候，退出遍历。然后把满足条件所有元素组成的集合返回。
drop(num) : 过滤集合中前num个元素
dropWhile{...} : 相同条件下，和执行takeWhile{...}函数后得到的结果相反
dropLast(num) : 过滤集合中后num个元素
dropLastWhile{...} : 相同条件下，和执行takeLastWhile{...}函数后得到的结果相反
distinct() : 去除重复元素
distinctBy{...} : 根据操作元素后的结果去除重复元素
slice : 过滤掉所有不满足执行下标的元素。
 */

class Test7 {
    /**
     * ------   filter -------
    [3, 5, 6, 7, 2, 4, 10, 9, 8]
    [5]
    [-1, -3, 1]
    [1, 3, 4, 5, 6, 10]
    ------   take -------
    [-1, -3, 1, 3, 5]
    [-1, -3, 1, 3]
    [2, 4, 10, 9, 8]
    [10, 9, 8]
    ------   drop -------
    [6, 7, 2, 4, 10, 9, 8]
    [5, 6, 7, 2, 4, 10, 9, 8]
    [-1, -3, 1, 3, 5, 6, 7]
    [-1, -3, 1, 3, 5, 6, 7, 2, 4]
    ------   distinct -------
    [1, 5, 2, 6, 3, 7, 4, 8]
    [1, 5, 2, 6, 3, 7, 4, 8]
    ------   slice -------
    [-3, 3, 6, 2]
    [-3, 1, 3, 5, 6]
     */
    //
    fun test() {
        val list1 = listOf(-1, -3, 1, 3, 5, 6, 7, 2, 4, 10, 9, 8)
        val list2 = listOf(1, 3, 4, 5, null, 6, null, 10)
        val list3 = listOf(1, 1, 5, 2, 2, 6, 3, 3, 7, 4, 4, 8)

        println("  ------   filter -------")
        println(list1.filter { it > 1 })
        println(list1.filterIndexed { index, result ->
            index < 5 && result > 3
        })
        println(list1.filterNot { it > 1 })
        println(list2.filterNotNull())

        println("  ------   take -------")
        println(list1.take(5))
        println(list1.takeWhile { it < 5 })
        println(list1.takeLast(5))
        println(list1.takeLastWhile { it > 5 })

        println("  ------   drop -------")
        println(list1.drop(5))
        println(list1.dropWhile { it < 5 })
        println(list1.dropLast(5))
        println(list1.dropLastWhile { it > 5 })

        println("  ------   distinct -------")
        println(list3.distinct())
        println(list3.distinctBy { it + 2 })

        println("  ------   slice -------")
        println(list1.slice(listOf(1, 3, 5, 7)))
        println(list1.slice(IntRange(1, 5)))


    }
}