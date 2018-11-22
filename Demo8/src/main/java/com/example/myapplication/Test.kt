package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/22 13:57
 *
 *
 */

class MyClass2 {
    companion object CompanionName {
        val INNER_PARAMETER = "can only be inner"
        fun newInstance() = MyClass2()
    }
}
class MyClass3 {
    companion object {
        val INNER_PARAMETER = "can only be inner"
    }
}