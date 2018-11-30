package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 16:37
 *
 *
 */

/**
 * 统计操作符包括：
any() : 判断是不是一个集合，若是，则在判断集合是否为空，若为空则返回false,反之返回true,若不是集合，则返回hasNext
any{...} : 判断集合中是否存在满足条件的元素。若存在则返回true,反之返回false
all{...} : 判断集合中的所有元素是否都满足条件。若是则返回true,反之则返回false
none() : 和any()函数的作用相反
none{...} : 和all{...}函数的作用相反
max() : 获取集合中最大的元素，若为空元素集合，则返回null
maxBy{...} : 获取方法处理后返回结果最大值对应那个元素的初始值，如果没有则返回null
min() : 获取集合中最小的元素，若为空元素集合，则返回null
minBy{...} : 获取方法处理后返回结果最小值对应那个元素的初始值，如果没有则返回null
sum() : 计算出集合元素累加的结果。
sumBy{...} : 根据元素运算操作后的结果，然后根据这个结果计算出累加的值。
sumByDouble{...} : 和sumBy{}相似，不过sumBy{}是操作Int类型数据，而sumByDouble{}操作的是Double类型数据
average() : 获取平均数
reduce{...} : 从集合中的第一项到最后一项的累计操作。
reduceIndexed{...} : 和reduce{}作用相同，只是其可以操作元素的下标(index)
reduceRight{...} : 从集合中的最后一项到第一项的累计操作。
reduceRightIndexed{...} : 和reduceRight{}作用相同，只是其可以操作元素的下标(index)
fold{...} : 和reduce{}类似，但是fold{}有一个初始值
foldIndexed{...} : 和reduceIndexed{}类似，但是foldIndexed{}有一个初始值
foldRight{...} : 和reduceRight{}类似，但是foldRight{}有一个初始值
foldRightIndexed{...} : 和reduceRightIndexed{}类似，但是foldRightIndexed{}有一个初始值

 */
class Test9 {
    fun test() {
        val list1 = listOf(1, 2, 3, 4, 5)

        println("  ------   any -------")
        println(list1.any())
        println(list1.any { it > 10 })

        println("  ------   all -------")
        println(list1.all { it > 2 })

        println("  ------   none -------")
        println(list1.none())
        println(list1.none { it > 2 })

        println("  ------   max -------")
        println(list1.max())
        println(list1.maxBy { it + 2 })

        println("  ------   min -------")
        println(list1.min())        // 返回集合中最小的元素
        println(list1.minBy { it + 2 })

        println("  ------   sum -------")
        println(list1.sum())
        println(list1.sumBy { it + 2 })
        println(list1.sumByDouble { it.toDouble() })

        println(" ------  average -----")
        println(list1.average())

        println("  ------   reduce  -------")
        println(list1.reduce { result, next -> result + next })
        println(list1.reduceIndexed { index, result, next ->
            index + result + next
        })
        println(list1.reduceRight { result, next -> result + next })
        println(list1.reduceRightIndexed { index, result, next ->
            index + result + next
        })

        println("  ------   fold  -------")
        println(list1.fold(3) { result, next -> result + next })
        println(list1.foldIndexed(3) { index, result, next ->
            index + result + next
        })
        println(list1.foldRight(3) { result, next -> result + next })
        println(list1.foldRightIndexed(3) { index, result, next ->
            index + result + next
        })


    }
}