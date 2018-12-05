package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/5 17:24
 *
 *
 */

open class Demo {
    open val valStr = "我是用val修饰的属性"
}

class DemoTest : Demo() {

    /*
     * 这里用val、或者var重写都是可以的。
     * 不过当用val修饰的时候不能有setter()函数，编辑器直接会报红的
     */

//     override val valStr: String
//       get() = super.valStr

     override var valStr: String = ""
          set(value) {field=value+"==="}
      get() {return (super.valStr+"ddddddd")}
//    get() = super.valStr
    //   get() = super.valStr

//      override val valStr: String = ""

//    override var valStr: String = "abc"
//        set(value) {
//            field = value
//        }
}

fun test() {
    println(DemoTest().valStr)

    val demo = DemoTest()
    demo.valStr = "1212121212"
    println(demo.valStr)

}