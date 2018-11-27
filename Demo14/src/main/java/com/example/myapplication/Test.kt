package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * @ describe
 *
 * 类成员
类可以包含：
构造函数与初始化块
函数
属性
嵌套类与内部类
对象声明
 *
 * @author lzl
 *
 * @ time 2018/11/27 16:06
 *
 *
 */
/**
 * 在 Kotlin 中所有类都有一个共同的超类 Any，这对于没有超类型声明的类是默认超类：
 * 注意：Any 并不是 java.lang.Object；尤其是，它除了 equals()、hashCode() 与 toString() 外没有任何成员。 更多细节请查阅Java互操作性部分。
 */
class Test {

}


/**
 * 要声明一个显式的超类型，我们把类型放到类头的冒号之后：
 */
open class Base(p: Int)

class Derived(p: Int) : Base(p){

}

open class Parent
class Child : Parent{
    constructor():super()
}

/**
 * 如果派生类有一个主构造函数，其基类型可以（并且必须） 用基类的主构造函数参数就地初始化。
如果类没有主构造函数，那么每个次构造函数必须使用 super 关键字初始化其基类型，或委托给另一个构造函数做到这一点。
注意，在这种情况下，不同的次构造函数可以调用基类型的不同的构造函数：
 */
class MyView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
    fun MyView(){}
}

