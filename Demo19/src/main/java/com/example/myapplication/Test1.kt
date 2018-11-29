package com.example.myapplication

/**
 * @ describe  在上面的代码中出现了set(value){field = value}这样的一句代码。
 * 其中value是Koltin写setter()函数时其参数的约定俗成的习惯。你也可以换成其他的值。而field是指属性本身。
 *
 *
 * getter()对应Java中的get()函数，setter()对应Java中的set()函数。不过注意的是，不存在Getter()与Setter()的，这只是Kotlin中的叫法而已，真是的写法，还是用get()、set()。可以看下面的例子。
在Kotlin中，普通的类中一般是不提供getter()与setter()函数的，因为在普通的类中几乎用不到，这一点和Java是相同的，但是Java中在定义纯粹的数据类时，会用到get()与set()函数，但是Kotlin专门这种情况定义了数据类,这个特征。而数据类是系统已经为我们实现了get()和set()函数

 * @author lzl
 *
 * @ time 2018/11/29 15:00
 *
 *
 */

class Test1 {

    /*
     * getter 和 setter是可选的
     */

    // 当用var修饰时，必须为属性赋默认值(特指基本数据类型，因为自定义的类型可以使用后期初始化属性，见后续) 即使在用getter()的情况下,不过这样写出来，不管我们怎么去改变其值，其值都为`123`
    var test1: String = ""
        get() = "123"
        set(value) {
            field = "dd"
        }
//        set(value1) {
//            field = value1
//        }

    // 用val修饰时，用getter()函数时，属性可以不赋默认值。但是不能有setter()函数。
    val test2: String
        get() = "123"       // 等价于：val test2 : String = "123"
}

