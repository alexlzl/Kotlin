package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/28 14:11
 *
 *
 */

/**
 * 数据类有着和Kotlin其他类不一样的特性。除了含有其他类的一些特性外，还有着其独特的特点。并且也是数据类必须满足的条件：
主构造函数需要至少有一个参数
主构造函数的所有参数需要标记为 val 或 var；
数据类不能是抽象、开放、密封或者内部的；
数据类是可以实现接口的，如(序列化接口)，同时也是可以继承其他类的，如继承自一个密封类。
 */
 data class Test1(var par1:String) {

    fun test(){
        class T{
           inner class A{

            }
        }
        data class Child(var par2:String){

        }

        fun tt(){

        }
    }

    data class Child(var par2:String){

    }
}