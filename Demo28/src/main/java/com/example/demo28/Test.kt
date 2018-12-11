package com.example.demo28

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/11 13:37
 *
 *
 */
class Test {
    fun test() {
        //    自kotlin 1.1起,开始有[绑定函数与属性引用](Bound Function and Property Reference)
//    1.绑定函数引用:
        //传统用法
        val numberRegex = "\\d+".toRegex()
        println(numberRegex.matches("29")) // 输出“true”

        //绑定函数引用,isNumber存储/绑定函数引用
        val isNumber1 = numberRegex::matches
        println(isNumber1("29")) // 输出“true”

        //直接调用函数引用
        val strings = listOf("abc", "124", "a70")
        println(strings.filter(numberRegex::matches)) // 输出“[124]”

        //引用的接收者的类型不再是参数
        val isNumber: (CharSequence) -> Boolean = numberRegex::matches
        val matches: (Regex, CharSequence) -> Boolean = Regex::matches

//    2.绑定属性引用:
        val prop = "abc"::length
        println(prop)//输出property length
        println(prop.get())   // 输出“3”
    }


}