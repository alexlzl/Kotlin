package com.example.myapplication

/**
 * @ describe  主构造函数在类头中申明，而次构造函数在类体中申明；
主构造函数没有任何修饰符时可以省略constructor关键字，而次构造函数不能省略；
主构造函数不能包含任何的代码，而次构造函数可以；
主构造函数的参数可以在类体中的属性初始化代码和初始化块中使用，而次构造函数的参数不能；
主构造函数中可以直接申明并初始化属性，而次构造函数不能直接申明属性；
如果申明了主构造函数，那么所有的次构造函数都必需直接或间接地委托给主构造函数；
非抽象类中如果没有声明任何构造函数，会生成一个不带参数的主构造函数，而不会生成任何次构造函数。
 *
 * @author lzl
 *
 * @ time 2018/11/27 15:49
 *
 *
 */

/**
 * 在Kotlin中一个类可以有一个主构造函数和一个或多个次构造函数；
主构造函数是类头的一部分：它跟在类名（和可选的类型参数）后。如果主构造函数没有任何注解或可见性修饰符，constructor关键字可省略，否则是必须的；
主构函数不能包含任何代码，初始化代码放在以init关键字作为前缀的初始化块中；
主构函数的参数可以在初始化块中使用，也可以在类体内声明的属性初始化器中使用；
与普通属性一样，主构函数中声明的属性也可以是可变（var ）或者只读（val ）；
 */



/**
 * 普通构造函数================
直接命名即可
需要有默认值
基本类型可以缺省
使用缺省一定要把默认类型写对
调用init函数后可以作为全局变量使用
 */
class MyBean public constructor(name: String, age: Int, sex: Boolean) {
    var name: String = ""
    var age: Int = 0
    //缺省
    var sex = false


    init {
        this.name = name
        this.age = age
        this.sex = sex
    }

}


/**
 * 多重构造函数
多重构造函数需要有一个主函数，和N个次函数
次函数将委托给主函数
委托关系用this关键词表示
 */
class MyBeanO(name: String, age: Int) {
    var name: String = ""

    var age: Int = 0
    //缺省
    var sex = false

    /**
     * 1. 多重构造函数需要有一个主函数，和N个次函数
     * 2. 次函数将委托给主函数
     * 3. 委托关系用this关键词表示
     */
    //主函数
    constructor() : this("alex", 100)

    //次函数
    constructor(name: String = "alex") : this() {
        this.name = name
    }

    //次函数
    constructor(name: String, age: Int, sex: Boolean) : this() {
        this.name = name
        this.age = age
        this.sex = sex
    }

}



