package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 16:32
 *
 *
 */
/**
 * 生产操作符
生产操作符包括：
plus() : 合并两个集合中的元素，组成一个新的集合。也可以使用符号+
zip : 由两个集合按照相同的下标组成一个新集合。该新集合的类型是：List<Pair>
unzip : 和zip的作用相反。把一个类型为List<Pair>的集合拆分为两个集合。看下面的例子
partition : 判断元素是否满足条件把集合拆分为有两个Pair组成的新集合。
 */
class Test8 {

    /**
     * [1, 2, 3, 4, kotlin, Android, Java, PHP, JavaScript]
    [1, 2, 3, 4, kotlin, Android, Java, PHP, JavaScript]
    [(1, kotlin), (2, Android), (3, Java), (4, PHP)]
    [1-kotlin, 2-Android, 3-Java, 4-PHP]
    ([1, 2, 3, 4], [Kotlin, Android, Java, PHP])
    ([Java, JavaScript], [kotlin, Android, PHP])
     */
    fun test() {
        val list1 = listOf(1, 2, 3, 4)
        val list2 = listOf("kotlin", "Android", "Java", "PHP", "JavaScript")

// plus() 和 `+`一样
        println(list1.plus(list2))
        println(list1 + list2)

// zip
        println(list1.zip(list2))
        println(list1.zip(list2) {       // 组成的新集合由元素少的原集合决定
            it1, it2 ->
            it1.toString().plus("-").plus(it2)
        })

// unzip
        val newList = listOf(Pair(1, "Kotlin"), Pair(2, "Android"), Pair(3, "Java"), Pair(4, "PHP"))
        println(newList.unzip())

// partition
        println(list2.partition { it.startsWith("Ja") })


    }
}