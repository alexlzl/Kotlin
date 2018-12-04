package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/3 18:53
 *
 *
 */

/**
 * 当存在主构造函数时，主构造函数一般实现基类型中参数最多的构造函数，
 * 参数少的构造函数则用this关键字引用即可了。这点在Kotlin——中级篇（一）：类（class）详解这篇文章是讲解到的。
 */
class MyView1(context: Context?, attrs: AttributeSet?, defStyleAttr: Int)
    : View(context, attrs, defStyleAttr) {

    constructor(context: Context?) : this(context, null, 0)

    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
}



