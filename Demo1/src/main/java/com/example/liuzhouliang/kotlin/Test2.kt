package com.example.liuzhouliang.kotlin

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/8 14:28
 *
 *
 */
/**
 * kotlin 类默认是final的，如果需要重写加上open标识
 */
open class Test3(arg1: String) {
    private var aa: String? = null
    private fun Test3() {

    }

    /**
     * kotlin 中方法默认是final的，如果需要重写加上open标识
     */
    open fun test() {

    }

}