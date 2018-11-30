package com.example.myapplication

/**
 * @ describe
 * 装箱与拆箱
在Kotlin中，存在数字的装箱，但是不存在拆箱。
因为Kotlin是没有基本数据类型的，Kotlin是万般皆对象的原则。
故不存在和Java中的类似int是数据类型，Integer是整型的引用类型。
 *
 * @author lzl
 *
 * @ time 2018/11/30 16:58
 *
 *
 */
class Test1 {
    fun test() {
        val numValue: Int = 123
        //装箱的过程，其实装箱之后其值是没有变化的
        val numValueBox: Int? = numValue
        println("装箱后： numValueBox => $numValueBox")
    }


    /**
     * 判断两个数值是否相等（==）,判断两个数值在内存中的地址是否相等（===）,其实上面的装箱操作之后其内存中的地址根据其数据类型的数值范围而定。
     */
    fun test1() {
        val numValue: Int = 128
        val numValueBox: Int? = numValue

/*
    比较两个数字
 */
        var result: Boolean
        result = numValue == numValueBox
        println("numValue == numValueBox => $result")  // => true,其值是相等的

        result = numValue === numValueBox
/*
  上面定义的变量是Int类型，大于127其内存地址不同，反之则相同。
  这是`kotlin`的缓存策略导致的，而缓存的范围是` -128 ~ 127 `。
  故，下面的打印为false
*/
        println("numValue === numValueBox => $result")

        /**
         * numValue == numValueBox => true
        numValue === numValueBox => false
         */
    }
}