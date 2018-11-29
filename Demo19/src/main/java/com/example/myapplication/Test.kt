package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 14:24
 *
 *
 */

/**
 * 在JVM上，如果类主构造函数的所有参数都具有默认值，编译器将生成一个额外的无参数构造函数，它将使用默认值。
 * 这使得更容易使用Kotlin与诸如Jackson或JPA的库，通过无参数构造函数创建类实例。
 *  同理可看出，当类存在主构造函数并且有默认值时，二级构造函数也适用
 */
fun main(args: Array<String>) {
    var test = Test()
    var test1 = Test(1,2)
    var test2 = Test(4, 5, 6)
}

class Test constructor(num1: Int = 10, num2: Int = 20) {

    init {
        println("num1 = $num1\t num2 = $num2")
    }

     constructor(num1: Int = 1, num2: Int = 2, num3: Int = 3) : this(num1, num2) {
        println("num1 = $num1\t num2 = $num2 \t num3 = $num3")
    }

}


class A constructor(var name:String="a",var a:Int){

    constructor( name:String,s:String):this("d",1){}
    constructor(name:String,age:Int,s: String):this("name",1){}
}

fun test(){
    //编译异常，因主构造函数参数没有默认值,如果类主构造函数的所有参数都具有默认值，编译器将生成一个额外的无参数构造函数
//    A()
    A("name",1)
}
