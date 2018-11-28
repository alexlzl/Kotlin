package com.example.myapplication

/**
 * @ describe
 * 所谓受限的类继承结构，即当类中的一个值只能是有限的几种类型，而不能是其他的任何类型。
 * 这种受限的类继承结构从某种意义上讲，它相当于是枚举类的扩展。但是，我们知道Kotlin的枚举类中的枚举常量是受限的，因为每一个枚举常量只能存在一个实例。
 * 但是其和枚举类不同的地方在于，密封类的一个子类可以有可包含状态的多个实例。
 * 也可以说成，密封类是包含了一组受限的类集合，因为里面的类都是继承自这个密封类的。但是其和其他继承类（open）的区别在，密封类可以不被此文件外被继承，有效保护代码。但是，其密封类的子类的扩展是是可以在程序中任何位置的，即可以不在同一文件下。
 *
 * @author lzl
 *
 * @ time 2018/11/28 16:48
 *
 *
 */

/**
 * 定义密封类的关键字：sealed
 *
 * 密封类是不能被实例化的
 *
 * 分析：即所定义的子类都必须继承于密封类，表示一组受限的类
 *
 * 我们知道普通的继承类使用open关键字定义
 * 而密封类的子类必须是在密封类的内部或必须存在于密封类的同一文件。这一点就是上面提到的有效的代码保护。
 * 枚举类的中的每一个枚举常量都只能存在一个实例。而密封类的子类可以存在多个实例。
 */

sealed class SealedExpr {
    data class Person(val num1: Int, val num2: Int) : SealedExpr()

    object Add : SealedExpr()   // 单例模式
    object Minus : SealedExpr() // 单例模式
    class Test {

    }
}

open class TestChild : SealedExpr() {

}


/**
 * 和枚举类的区别
枚举类的中的每一个枚举常量都只能存在一个实例。而密封类的子类可以存在多个实例。

和普通继承类的区别
我们知道普通的继承类使用open关键字定义，在项目中的类都可继承至该类。如果你对Kotlin的继承类还不甚了解。请参见我的另一篇文章Kotlin——中级篇（四）：继承类详解。
而密封类的子类必须是在密封类的内部或必须存在于密封类的同一文件。这一点就是上面提到的有效的代码保护。
 */
fun test() {
    val mPerson1 = SealedExpr.Person(1, 22)
    println(mPerson1)

    val mPerson2 = SealedExpr.Person(2, 23)
    println(mPerson2)

    println(mPerson1.hashCode())
    println(mPerson2.hashCode())

}


/**
 * 使用密封类的好处
有效的保护代码（上面已说明原因）
在使用when表达式 的时候，如果能够验证语句覆盖了所有情况，就不需要为该语句再添加一个else子句了。使用密封类的好处
有效的保护代码（上面已说明原因）
在使用when表达式 的时候，如果能够验证语句覆盖了所有情况，就不需要为该语句再添加一个else子句了。
 */
sealed class SealedExpr1 {
    data class Person(val name: String, val age: Int) : SealedExpr1()
    object Add : SealedExpr1()
    companion object Minus : SealedExpr1()
}

object NotANumber : SealedExpr1()

fun eval(expr: SealedExpr1) = when (expr) {
    is SealedExpr1.Add -> println("is Add")
    is SealedExpr1.Minus -> println("is Minus")
    is SealedExpr1.Person -> println(SealedExpr1.Person("Koltin", 22))
    NotANumber -> Double.NaN
}



