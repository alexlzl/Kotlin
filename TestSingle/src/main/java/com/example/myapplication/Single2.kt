package com.example.myapplication

/**
 * @ describe 懒汉式单例
 *
 * @author lzl
 *
 * @ time 2018/11/14 15:04
 *
 *
 */
//构造函数私有化
class Single2 private constructor() {

    //companion object定义静态内容
    companion object {
        private var single2: Single2? = null
        fun getInstance(): Single2 {
            if (single2 == null) {
                single2 = Single2()
            }
            return single2 ?: Single2()
        }
    }

    fun getName(): String {
        return "jim"
    }
}