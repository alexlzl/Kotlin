package com.example.myapplication

/**
 * @ describe
 * 在Java中，或者在我们平时的Android开发中，为了解析后台人员给我们提供的接口返回的Json字符串，
 * 我们会根据这个字符串去创建一个类或者实例对象，在这个类中，只包含了一些我们需要的数据，
 * 以及为了处理这些数据而所编写的方法。这样的类，在Kotlin中就被称为数据类。
 *
 * data为声明数据类的关键字，必须书写在class关键字之前。
 *在没有结构体的时候，大括号{}可省略。
 *构造函数中必须存在至少一个参数，并且必须使用val或var修饰。这一点在下面数据类特性中会详细讲解。
 *参数的默认值可有可无。（若要实例一个无参数的数据类，则就要用到默认值）
 * @author lzl
 *
 * @ time 2018/11/28 11:47
 *
 *
 */
//声明数据类的关键字为：data 构造函数中必须存在至少一个参数
data class TestData(var name: String = "alex", var age: Int = 100) {
    override fun toString(): String {
        return super.toString()
    }

}

/**
 * Koltin要修改数据类的属性，则使用其独有的copy()函数。其作用就是：修改部分属性，但是保持其他不变
 */
fun change(){
    var o=TestData("ch",111)
    println("before=="+o.name)
    var o1=o.copy(name = "change")
    println(o.name+"=======after========="+o1.name)
}

/**
 * 数据类也有其约定俗成的一些规定，这只是为增加代码的阅读性。
 *  即，当构造函数中的参过多时，为了代码的阅读性，一个参数的定义占据一行。
 */
data class Person(var param1: String = "param1",
                  var param2: String = "param2",
                  var param3: String,
                  var param4: Long,
                  var param5: Int = 2,
                  var param6: String,
                  var param7: Float = 3.14f,
                  var param8: Int,
                  var param9: String) {

}


/**
 * 当我们声明一个数据类时，编辑器自动为这个类做了一些事情，不然它怎么又比Java简洁呢。它会根据主构造函数中所定义的所有属性自动生成下列方法：
生成equals()函数与hasCode()函数
生成toString()函数，由类名（参数1 = 值1，参数2 = 值2，....）构成
由所定义的属性自动生成component1()、component2()、...、componentN()函数，其对应于属性的声明顺序。
copy()函数。在下面会实例讲解它的作用。
其中，当这些函数中的任何一个在类体中显式定义或继承自其基类型，则不会生成该函数
 */



