package com.example.myapplication

/**
 * @ describe 集合操作符
 *
 * @author lzl
 *
 * @ time 2018/11/30 15:11
 *
 *
 */
/**
 * contains(元素) : 检查集合中是否包含指定的元素，若存在则返回true，反之返回false
elementAt(index) : 获取对应下标的元素。若下标越界，会抛出IndexOutOfBoundsException（下标越界）异常，同get(index)一样
elementAtOrElse(index,{...}) : 获取对应下标的元素。若下标越界，返回默认值，此默认值就是你传入的下标的运算值
elementAtOrNull(index) : 获取对应下标的元素。若下标越界，返回null
first() : 获取第一个元素，若集合为空集合，这会抛出NoSuchElementException异常
first{} : 获取指定元素的第一个元素。若不满足条件，则抛出NoSuchElementException异常
firstOrNull() : 获取第一个元素，若集合为空集合，返回null
firstOrNull{} : 获取指定元素的第一个元素。若不满足条件，返回null
getOrElse(index,{...}) : 同elementAtOrElse一样
getOrNull(index) : 同elementAtOrNull一样
last() : 同first()相反
last{} : 同first{}相反
lastOrNull{} : 同firstOrNull()相反
lastOrNull() : 同firstOrNull{}相反
indexOf(元素) : 返回指定元素的下标，若不存在，则返回-1
indexOfFirst{...} : 返回第一个满足条件元素的下标，若不存在，则返回-1
indexOfLast{...} : 返回最后一个满足条件元素的下标，若不存在，则返回-1
single() : 若集合的长度等于0,则抛出NoSuchElementException异常，若等于1，则返回第一个元素。反之，则抛出IllegalArgumentException异常
single{} : 找到集合中满足条件的元素，若元素满足条件，则返回该元素。否则会根据不同的条件，抛出异常。这个方法慎用
singleOrNull() : 若集合的长度等于1,则返回第一个元素。否则，返回null
singleOrNull{} : 找到集合中满足条件的元素，若元素满足条件，则返回该元素。否则返回null
forEach{...} : 遍历元素。一般用作元素的打印
forEachIndexed{index,value} : 遍历元素，可获得集合中元素的下标。一般用作元素以及下标的打印
componentX() ： 这个函数在前面的章节中提过多次了。用于获取元素。其中的X只能代表1..5。详情可看下面的例子
 */
class Test6 {
    fun test() {
        val list = listOf("kotlin", "Android", "Java", "PHP", "Python", "IOS")
        println("  ------   contains -------")
        println(list.contains("JS"))

        println("  ------   elementAt -------")

        println(list.elementAt(2))
        println(list.elementAtOrElse(10, { it }))
        println(list.elementAtOrNull(10))

        println("  ------   get -------")
        println(list.get(2))
        println(list.getOrElse(10, { it }))
        println(list.getOrNull(10))

        println("  ------   first -------")
        println(list.first())
        println(list.first { it == "Android" })
        println(list.firstOrNull())
        println(list.firstOrNull { it == "Android" })

        println("  ------   last -------")
        println(list.last())
        println(list.last { it == "Android" })
        println(list.lastOrNull())
        println(list.lastOrNull { it == "Android" })

        println("  ------   indexOf -------")
        println(list.indexOf("Android"))
        println(list.indexOfFirst { it == "Android" })
        println(list.indexOfLast { it == "Android" })

        println("  ------   single -------")
        val list2 = listOf("list")
        println(list2.single())     // 只有当集合只有一个元素时，才去用这个函数，不然都会抛出异常。
        println(list2.single { it == "list" }) //当集合中的元素满足条件时，才去用这个函数，不然都会抛出异常。若满足条件返回该元素
        println(list2.singleOrNull()) // 只有当集合只有一个元素时，才去用这个函数，不然都会返回null。
        println(list2.singleOrNull { it == "list" }) //当集合中的元素满足条件时，才去用这个函数，不然返回null。若满足条件返回该元素

        println("  ------   forEach -------")
        list.forEach { println(it) }
        list.forEachIndexed { index, it -> println("index : $index \t value = $it") }

        println("  ------   componentX -------")
        println(list.component1())  // 等价于`list[0]  <=> list.get(0)`
        println(list.component2())  // 等价于`list[1]  <=> list.get(1)`
        println(list.component3())  // 等价于`list[2]  <=> list.get(2)`
        println(list.component4())  // 等价于`list[3]  <=> list.get(3)`
        println(list.component5())  // 等价于`list[4]  <=> list.get(4)`

    }
}