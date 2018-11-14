package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/14 15:46
 *
 *
 */

class Single4 private constructor(){
    companion object{
        val instance: Single4 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            Single4() }
    }

    fun getName():String{
        return "test========name"
    }
}