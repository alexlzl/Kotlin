package com.example.myapplication

/**
 * @ describe 全局函数，可以定义在类外面
 *
 * （1）可以看到全局函数的作用域是以包为作用域的；
（2）引入的时候可以直接使用import xxx.全局函数，这个跟java的不同；
（3）也就是同一个包作用域下，不可以有“同名”的全局函数；比如都在com.robot.test包下，有两个kt文件，在这两个kt文件中，都有同样的函数，会产生冲突的；
（4）如果不同的包作用域下，有“同名”的全局函数，则需要引入全局函数的全局路径即可；
 *
 * @author lzl
 *
 * @ time 2018/11/14 11:15
 *
 *
 */
 fun testOverAllFun(): String {
    return "OverAllFun"

}

class TestOverAllFun {

}