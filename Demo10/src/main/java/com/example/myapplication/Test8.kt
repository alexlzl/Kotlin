package com.example.myapplication

import kotlin.reflect.KClass

/**
 * @ describe
 * KClass是Kotlin中与Java中Class类对应的类，用于Kotlin中的反射。
 *  如果要使用泛型类作为注解参数，则需要通过星形投影
 *  星形投影表示你不知道关于泛型实参的任何信息，比如在上面的例子中，你只知道List本身,而不知道它具体的泛型实参
 *  由此可见，在Kotlin中应用注解的语法和Java很相似，但Kotlin中你注解的目标要比Java更广。
 *  当然，还是那句话，注解给人看是没多大意义的，还是需要在程序里处理，这就需要掌握反射，不过，在介绍反射之前，我们需要对Java虚拟机中的内存模型进行一点简单的了解......
 *
 * @author lzl
 *
 * @ time 2018/11/26 18:41
 *
 *
 */
annotation class ListAnnotation(val clazz: KClass<out List<*>>)

/*把List作为注解参数*/
@ListAnnotation(List::class)
fun sum() {

}

