package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/29 15:05
 *
 *
 */

class Mime{

    var str1 = "test"
        get() = field   // 这句可以省略，kotlin默认实现的方式
        set(value){
            field = if (value.isNotEmpty()) value else "null"
        }

    var str2 = ""
        get() = "随意怎么修改都不会改变"
        set(value){
            field = if (value.isNotEmpty()) value else "null"
        }
}

