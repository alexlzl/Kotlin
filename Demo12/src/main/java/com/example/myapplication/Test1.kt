package com.example.myapplication

/**
 * @ describe  https://www.jianshu.com/p/ed6431f3bd34
 *
 * @author lzl
 *
 * @ time 2018/11/27 12:08
 *
 *
 */
//如果主函数中参数在函数中被调用，需要用var或者val进行声明
class Test1(string: String) {
    var name = string
    //此处函数调用string会编译异常
//    fun test(){
//        print(string)
//    }
}

class Test2(var string: String) {
    fun test() {
        print(string)
    }
}


class Test3(val string: String) {
    fun test() {
        print(string)
    }
}