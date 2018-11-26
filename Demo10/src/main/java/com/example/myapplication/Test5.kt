/**
 * 可以使用相同的语法来标注整个文件。 要做到这一点，把带有目标 file 的注解放在文件的顶层、package 指令之前或者在所有导入之前（如果文件在默认包中的话）：
 */
@file:JvmName("Foo")
package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/26 17:34
 *
 *
 */
var name="alex"
fun getN():String{
    return name
}

