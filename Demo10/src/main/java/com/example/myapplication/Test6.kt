package com.example.myapplication

/**
 * @ describe 支持的使用处目标的完整列表为：

file；
property（具有此目标的注解对 Java 不可见）；
field；
get（属性 getter）；
set（属性 setter）；
receiver（扩展函数或属性的接收者参数）；
param（构造函数参数）；
setparam（属性 setter 参数）；
delegate（为委托属性存储其委托实例的字段）。
如果不指定使用处目标，则根据正在使用的注解的 @Target 注解来选择目标 。如果有多个适用的目标，则使用以下列表中的第一个适用目标：
param;
property;
field.
 *
 * @author lzl
 *
 * @ time 2018/11/26 17:44
 *
 *
 */

/*不接收参数的注解*/
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class MyAnnotation

/*接受参数的注解*/
annotation class MyAnnotation2(val name: String)

/*接受多个参数的注解*/
annotation class MyAnnotation3(vararg val name: String)


annotation class A1

@Target(AnnotationTarget.TYPE, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
annotation class A2

/**
 *如果你对同一目标有多个注解，那么可以这样来避免目标重复——在目标后面添加方括号并将所有注解放在方括号内：
 */
class Test6 {
    @set:[A1 A2]
    @field:A2
    var name = "alex"
}

/**
 * 要标注扩展函数的接收者参数，请使用以下语法：
 */
fun @receiver:A2 String.myExtension() {
    print("111111111")
}

fun @A2 String.myExtension1() {
    print("111111111")
}

fun test1(vararg str: String) {

}