package com.example.myapplication

/**
 * @ describe 显式声明构造方法为private
companion object用来在class内部声明一个对象
LazySingleton的实例instance 通过lazy来实现懒汉式加载
lazy默认情况下是线程安全的，这就可以避免多个线程同时访问生成多个实例的问题
 *
 * @author lzl
 *
 * @ time 2018/11/14 15:46
 *
 *
 */

class Single4 private constructor() {
    companion object {
        /**
         * 委托属性语法是： val/var <属性名>: <类型> by <表达式>。
         * 在 by 后面的表达式是该 委托， 因为属性对应的 get()（和 set()）会被委托给它的 getValue() 和 setValue() 方法。
         * 属性的委托不必实现任何的接口，但是需要提供一个 getValue() 函数（和 setValue()——对于 var 属性）
         */
        val instance: Single4 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            Single4()
        }
    }

    fun getName(): String {
        return "test========name"
    }
}