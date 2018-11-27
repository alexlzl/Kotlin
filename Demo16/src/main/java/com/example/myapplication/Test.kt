package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/27 18:19
 *
 *
 */

/**
 * 属性覆盖与方法覆盖类似；在超类中声明然后在派生类中重新声明的属性必须以 override 开头，并且它们必须具有兼容的类型。
 * 每个声明的属性可以由具有初始化器的属性或者具有 getter 方法的属性覆盖。
 */
interface Foo {
    val count: Int
}

/**
 * 你也可以用一个 var 属性覆盖一个 val 属性，但反之则不行。
 * 这是允许的，因为一个 val 属性本质上声明了一个 getter 方法，而将其覆盖为 var 只是在子类中额外声明一个 setter 方法。
请注意，你可以在主构造函数中使用 override 关键字作为属性声明的一部分。
 */
class Bar1(override var count: Int) : Foo{

   fun test(){
       count=100
   }
}

class Bar2 : Foo {
    override var count: Int = 0
}




