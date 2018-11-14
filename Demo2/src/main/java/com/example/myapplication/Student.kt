package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/9 10:31
 *
 *
 */
class Student {
    var age: String = "tes"
        get() = field.toUpperCase()
        set(value) {
            field = value + "d"
        }


    var name: String = "abc"
        get() = field.toUpperCase()
        set(value) {
            field = "Name: $value"
        }
}