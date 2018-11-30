package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 13:55
 *
 *
 */
/**
 * Set类型集合的使用和List类型集合大致相同。这里不做详细的介绍，只讲解它和List类型集合不同的地方。
声明并初始化Set的集合：使用setOf(..)函数
声明并初始化MutableSet的集合：使用mutableSetOf(..)函数
 */
class Test2 {
    fun test() {
        val set1 = setOf(1, 2, "3", "4", "2", 1, 2, 3, 4, 5)
        val mutableSet1 = mutableSetOf(1, 2, "3", "4", "2", 1, 2, 3, 4, 5)
        val mutableSet2: HashSet<String>  // 这里的HashSet<>和Java里面的HashSet<>一致
        // 遍历
        for (value in set1) {
            print("$value \t")
        }
        //输出结果1 	2 	3 	4 	2 	3 	4 	5
        /**
         * 在我们预计的效果中，遍历的结果应该为：1 2 3 4 2 1 2 3 4 5,但是结果却少了一个1 2。
         * 那么我们可以看出，Set类型集合会把重复的元素去除掉。这一点和Java是不谋而合的。
         * 这个特性也是Set类型集合与List集合类型的区别所在。
         */
    }
}