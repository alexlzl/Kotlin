package com.example.myapplication

import android.view.View

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 10:58
 *
 *
 */
sealed class UiOp {
    object Show : UiOp()
    object Hide : UiOp()
    class TranslateX(val px: Float) : UiOp()
    class TranslateY(val px: Float) : UiOp()
}
class TT:UiOp()

/**
 * 以上代码中，TranslateX 是一个类，它可以携带多于一个的信息，
 * 比如除了告诉 view 需要水平平移之外，还可以告诉 view 平移多少像素，甚至还可以告诉 view 平移的动画类型等信息，我想这大概就是密封类出现的意义吧。
除此之外，如果 when 语句的分支不需要携带除“显示或隐藏view之外的其它信息”时（即只需要表明 when 语句分支，不需要携带额外数据时），
用 object 关键字创建单例就可以了，并且此时 when 子句不需要使用 is 关键字。
只有需要携带额外信息时才定义密封类的子类，而且使用了密封类就不需要使用 else 子句，
每当我们多增加一个密封类的子类或单例，编译器就会在 when 语句中给出提示，
可以在编译阶段就及时发现错误，这也是以往 switch-case 语句和枚举不具备的功能。
 */
fun execute(view: View, op: UiOp) = when (op) {
    UiOp.Show -> view.visibility = View.VISIBLE
    UiOp.Hide -> view.visibility = View.GONE
    is UiOp.TranslateX -> view.translationX = op.px // 这个 when 语句分支不仅告诉 view 要水平移动，还告诉 view 需要移动多少距离，这是枚举等 Java 传统思想不容易实现的
    is UiOp.TranslateY -> view.translationY = op.px
    is TT->view.visibility=View.VISIBLE
}