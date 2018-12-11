package com.example.myapplication

/**
 * @ describe
 *
 * inline
内联函数
调用内联函数时，在编译期间，被定义的内联函数体的代码将被拷贝至每个调用方法体内。
优点：
取代默认的压栈调用，消除压栈、对象转换产生的内存分配、回调等开销
缺点：
编译后的代码膨胀，消耗更多内存空间
使用场景：
经常调用的高阶短函数
non-local control flow
内联函数中的内联lambda表达式中，return关键字将直接结束外部函数体，而非该lambda表达式或内联函数，该行为被称为非局部返回（non-local control flow）
noinline
在定义内联函数的参数列表中，指定不进行内联的 lambda 参数。
crossinline
在定义内联函数的参数列表中，指定内联但禁止return关键字（禁用non-local control flow功能）的lambda参数，通常该参数会被传递至另一高阶函数进行调用。
reified
具体化类型参数
在内联函数中，可以获取泛型的真实类型。
这是因为在编译期间，该泛型参数在代码拷贝中被解析成实参类型，从而避免了类型擦除过程。
当需要获取泛型参数的真实类型时，使用reified进行声明，此后可用于is、as、T::class等操作。
 *
 * @author lzl
 *
 * @ time 2018/12/6 17:46
 *
 *
 */

/**
 *自定义中缀函数--->（扩展函数）
 * 1.使用infix在fun前修饰
 * 2.只能有一个参数（uniqueParam）
 * 3.是二元的的，参数1：实例（北京）；参数二：参数
 */
infix fun String.中缀(uniqueParam: String): String {
    return "啦啦啦，我是中缀函数，实例是：" + this + ",我的唯一参数是" + uniqueParam
}

val resultInfix = "北京" 中缀 "上海"
fun  test(){
    println(resultInfix)
}
