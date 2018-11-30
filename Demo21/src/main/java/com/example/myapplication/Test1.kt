package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 11:37
 *
 *
 */

/**
 * Kotlin中的集合和其他语言不同的是，Kotlin集合可分为可变和不可变集合。
在Kotlin中，集合类型包含三种类型：它们分别是：List、Set、Map,他们之间存在以下几个异同点：
它们都是接口，并不是实际的类。
它们只实现了isEmpty()、size、contains()等函数以及属性。
List<E>和Set<E>都继承至Collection<out E>接口,且Collection<out E>继承于Iterable<out T>接口。而Map<K,V>是独立出来的一个接口。这一点和Java相同。
这三种集合类型分别有存在MutableList<E>、MutableSet<E>、MutableMap<K,V>接口，这些接口中提供了改变、操作集合的方法。例如add()、clear()、remove()等函数。
有以上三点我们可出，在定义集合类型变量的时候如果使用List<E>、Set<E>、Map<K,V>声明的时候该集合则是不可变集合，
而使用MutableList<E>、MutableSet<E>、MutableMap<K,V>的时候该集合才是可变类型集合。这里我就不提供源码来分析了，有兴趣的可以看一看源码！源码在kotlin\collections\Collections.kt文件
 */

class Test1 {

    /**
     * 不可变数组===================1
     */
    fun test() {
        val arr = arrayOf("1", "2", 3, 4, 5)
        val list1 = listOf(1, 2, "3", 4, "5")                // 随意创建
        val list2 = listOf<String>("1", "2", "3", "4", "5")  // 确定元素的值类型
        val list3 = listOf(arr)                          // 可传入一个数组

//        以下代码是错误的。因为List<E>只能是不可变集合。而add、remove、clear等函数时MutableList中的函数
//        list1.add()
//        list1.remove

// 遍历
        for (value in list1) {
            print("$value \t")
        }


    }

    /**
     * 可变数组
     */
    fun test1() {
        val arr = arrayOf("1",2,3,4)
        val mutableList1 = mutableListOf(1,2,"3",4,"5")                // 随意创建
        val mutableList2 = mutableListOf<String>("1","2","3","4","5")  // 确定元素的值类型
        val mutableList3 = mutableListOf(arr)                          // 可传入一个数组
        val mutableList : ArrayList<String>  // 这里的ArrayList<>和Java里面的ArrayList一致

        mutableList1.add("6")  // 添加元素
        mutableList1.add("7")
        mutableList1.remove(1)   // 删除某一元素

// 遍历
        for(value in mutableList1){
            print("$value \t")
        }

        mutableList1.clear()   // 清空集合


    }
}
