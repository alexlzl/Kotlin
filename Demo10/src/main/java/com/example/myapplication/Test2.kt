package com.example.myapplication

/**
 * @ describe 注解定义
 *
 * 注解是将元数据附加到代码的方法。要声明注解，请将 annotation 修饰符放在类的前面：
 *
 * 注解的附加属性可以通过用元注解标注注解类来指定：
 @Target 指定可以用该注解标注的元素的可能的类型（类、函数、属性、表达式等）；
 @Retention 指定该注解是否存储在编译后的 class 文件中，以及它在运行时能否通过反射可见 （默认都是 true）；
 @Repeatable 允许在单个元素上多次使用相同的该注解；
 @MustBeDocumented 指定该注解是公有 API 的一部分，并且应该包含在生成的 API 文档中显示的类或方法的签名中。
 *
 * @author lzl
 *
 * @ time 2018/11/26 11:02
 *
 *
 */

annotation class TestAnnotation1(val names: Array<String>)