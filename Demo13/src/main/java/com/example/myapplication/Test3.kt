package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/27 15:32
 *
 *
 */
/**
 * 当没有主构造参数时，创建次构造函数
 * 正确使用：
 */
class Test3 {

    private constructor() {

    }

    constructor(name: String) : this() {

    }

    constructor(name: String, age: Int) : this(name) {

    }
}




