package com.example.demo28

/**
 * @ describe    构造函数引用(Constructor References)
 *
 * @author lzl
 *
 * @ time 2018/12/11 15:12
 *
 *
 */
//构造函数也可以像方法和属性一样引用,该引用与构造函数接受相同参数并且返回相应类型,
//使用::操作符+类名来引用构造函数:
class Foo

//factory: () -> Foo 代表Foo类的构造函数
fun function(factory: () -> Foo) {
    val x: Foo = factory()
}


//::Foo 代表类Foo的构造函数引用

fun test() {
    function(::Foo)
}


