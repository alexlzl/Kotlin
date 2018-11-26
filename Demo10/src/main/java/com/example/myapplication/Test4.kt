package com.example.myapplication

/**
 * @ describe 当对属性或主构造函数参数进行标注时，从相应的 Kotlin 元素生成的 Java 元素会有多个，因此在生成的 Java 字节码中该注解有多个可能位置 。
 * 如果要指定精确地指定应该如何生成该注解，请使用以下语法
 *如果不指定使用处目标，则根据正在使用的注解的 @Target 注解来选择目标 。如果有多个适用的目标，则使用以下列表中的第一个适用目标：
param;
property;
field.
 * @author lzl
 *
 * @ time 2018/11/26 16:42
 *
 *
 */

annotation class AnnT

// 标注 Java 字段
// 标注 Java getter
// 标注 Java 构造函数参数
class Example(@get:AnnT val bar: String,
              @param:AnnT val quux: Any) {

}
