package com.example.myapplication

/**
 * @ describe 静态内部类式单例
 *
 * @author lzl
 *
 * @ time 2018/11/14 17:23
 *
 *
 */
class Single5 private constructor() {
    /**
     * 静态修饰
     */
    companion object {
        val instance = SingletonHolder.holder

    }

    private object SingletonHolder {
        val holder = Single5()
    }

    fun getName(): String {
        return "single5"
    }
}