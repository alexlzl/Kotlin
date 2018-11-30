package com.example.myapplication

import android.annotation.TargetApi
import android.os.Build

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 14:03
 *
 *
 */

/**
 * Map<K,V>类型集合和List以及Set都有着差别。下面我们看Map类型集合的声明及初始化。
同前面两种类型一样，Map同样也分为不可变与可变集合。其中：
不可变的Map类型集合的初始化使用：mapOf()函数
可变的Map类型集合的初始化使用：mutableMapOf()函数
当我们的键存在重复时，集合会过滤掉之前重复的元素。
 */
class Test3{
    @TargetApi(Build.VERSION_CODES.N)
    fun test(){
        // 以键值对的形式出现，键与值之间使用to
        val map1 = mapOf("key1" to 2 , "key2" to 3)
        val map2 = mapOf<Int,String>(1 to "value1" , 2 to "value2")
        val mutableMap = mutableMapOf("key1" to 2 , "key1" to 3)
        val hashMap = hashMapOf("key1" to 2 , "key1" to 3)   // 同Java中的HashMap

        map2.forEach{
            key,value -> println("$key \t $value")
        }


    }
}