package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/22 14:15
 *
 *
 */
interface MyInterface {
    fun operateVariable():String
}

interface TestInter{
    fun test():String
}

fun operateClass(interfaceObject: MyInterface) :String= interfaceObject.operateVariable()

class TestObject5 {
    //实现接口
    companion object Imp : MyInterface {
        val INNER_PARAMETER = "can only be inner"
        override fun operateVariable():String {
            //do something...
            return "object========"
        }
    }

    object Impl:TestInter{
        override fun test(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

    fun test(test:TestInter){

    }
}