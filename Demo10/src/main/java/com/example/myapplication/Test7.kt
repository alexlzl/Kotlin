package com.example.myapplication

import kotlin.reflect.KClass

/**
 * @ describe 点目标的使用
 * 由于在Kotlin中的单个申明往往对应了多个Java声明，例如，一个Property对应了一个Field和Getter和Setter,为了使标注更为精确，Kotlin中还允许使用点目标。
 * 点目标的语法为 @目标:注解名 例如:@get:MyAnnotation
 *
 * 在Kotlin中支持以下点目标:
property:代表kotlin中的属性，不能被Java的注解所应用
field:为属性生成的字段（包括后备字段）
get:属性的getter
set:属性的setter
receiver:扩展函数/属性的接收者
param:构造函数的参数
setparam:属性setter的参数
delegate:委托属性存储委托实例的字段
file:在文件中声明的顶层函数与类
如果你希望你的注解使用类作为类型参数的话，你可以定义为:
 *
 * @author lzl
 *
 * @ time 2018/11/26 18:24
 *
 *
 */

class Country {
    /*对属性的getter使用注解*/
    @get:MyAnnotation2("Editable")
    var name: String = ""

    /*对属性使用注解*/
    @MyAnnotation2("Editable")
    var pop: Int = 0

    /*对属性的Setter使用注解*/
    @MyAnnotation3("Editable", "Can be below 0")
    @set:MyAnnotation3
    var coin: Int = 0

    /*对生成的Field使用注解*/
    /*具有setter的属性一般会自动生成backing field(后备字段)*/
    @field:MyAnnotation2("")
    val army: Int = 1000

}


//如果你希望你的注解使用类作为类型参数的话，你可以定义为:
annotation class MyClassAnnotation(vararg val clazz : KClass<out Any>)
//注意必须out Any,否则泛型参数无法协变导致你只能使用Any类作为参数

