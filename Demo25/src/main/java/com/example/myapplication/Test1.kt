package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/5 18:03
 *
 *
 */
/**
 * Getter()函数慎用super关键字
 * 在这里值得注意的是，在实际的项目中在重写属性的时候不用get() = super.xxx,因为这样的话，
 * 不管你是否重新为该属性赋了新值，还是支持setter(),在使用的时候都调用的是基类中的属性值。
 */
class DemoTest1 : Demo() {

    /*
     * 这里介绍重写属性是，getter()函数中使用`super`关键字的情况
     */

    override var valStr: String = "abc"
        get() = super.valStr
        set(value) {
            field = value
        }
}

fun test1() {
    println(DemoTest1().valStr)
    val demo = DemoTest1()
    demo.valStr = "1212121212"
    println(demo.valStr)
}



