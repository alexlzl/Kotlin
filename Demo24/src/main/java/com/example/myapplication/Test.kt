package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * @ describe  在上一篇文章中，讲解到了Kotlin类，可以有一个主构造函数，或者多个辅助函数。或者没有构造函数的情况
 *
 * @author lzl
 *
 * @ time 2018/12/3 18:16
 *
 *
 */


/**
 * 无主构造函数
当实现类无主构造函数时，则每个辅助构造函数必须使用super关键字初始化基类型，或者委托给另一个构造函数。 请注意，在这种情况下，不同的辅助构造函数可以调用基类型的不同构造函数
例：这里举例在Android中常见的自定义View实现，我们熟知，当我们指定一个组件是，一般实现继承类(基类型)的三个构造函数。
 */
class MyView : View {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr)
}

open class T {
}

class M : T {
    constructor(string: String) : super()
}

fun test() {
    M("SS")
}

open class Parent {

}

class Child(string: String,int: Int) : Parent() {

}




