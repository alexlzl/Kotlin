package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/27 15:10
 *
 *
 */
/**
 * 如果类有一个主构造函数，每个次构造函数需要委托给主构造函数， 可以直接委托或者通过别的次构造函数间接委托。
 * 委托到同一个类的另一个构造函数用 this 关键字即可：
 */
class Person(val name: String="alex") {
    constructor(name: String, parent: Person) : this(name) {
    }
}


/**
 * 请注意，初始化块中的代码实际上会成为主构造函数的一部分。
 * 委托给主构造函数会作为次构造函数的第一条语句
 * ，因此所有初始化块中的代码都会在次构造函数体之前执行。
 * 即使该类没有主构造函数，这种委托仍会隐式发生，并且仍会执行初始化块：
 */
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

/**
 * 如果一个非抽象类没有声明任何（主或次）构造函数，它会有一个生成的不带参数的主构造函数。
 * 构造函数的可见性是 public。
 * 如果你不希望你的类有一个公有构造函数，你需要声明一个带有非默认可见性的空的主构造函数：
 */
class DontCreateMe private constructor() {}

/**
 * 注意：在 JVM 上，如果主构造函数的所有的参数都有默认值，编译器会生成 一个额外的无参构造函数，它将使用默认值。
 * 这使得 Kotlin 更易于使用像 Jackson 或者 JPA 这样的通过无参构造函数创建类的实例的库。
 */
class Customer(val customerName: String = "")
