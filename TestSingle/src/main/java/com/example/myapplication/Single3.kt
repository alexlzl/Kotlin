package com.example.myapplication

/**
 * @ describe线程安全懒汉式
 *
 * @author lzl
 *
 * @ time 2018/11/14 15:21
 *
 *
 */
class Single3 private constructor(){
    companion object{
        private var single3:Single3?=null
        @Synchronized
        fun getInstanc():Single3{
            if(single3==null){
                single3= Single3()
            }
            return single3?: Single3()
        }
    }

    fun getName():String{
        return "test====single3"
    }

}