package com.example.myapplication

/**
 * @ describe 其自身所用的类的名称（不是另一个名称的限定符）可用作对该类的伴生对象 （无论是否命名）的引用：
 *
 * @author lzl
 *
 * @ time 2018/11/22 18:26
 *
 *
 */
class MyClass1 {
    companion object Named {}
}

val x = MyClass1

class MyClass22 {
    companion object {}
}

val y = MyClass22