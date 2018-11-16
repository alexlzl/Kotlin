package com.example.myapplication

/**
 * @ describe 扩展类的属性和函数
 *
 * @author lzl
 *
 * @ time 2018/11/15 18:12
 *
 *
 */
class TopFun {
    /**
     * 给List 类定义一个扩展函数transform() ,
     * 然后使用高阶函数，其中方法参数是一个函数
     */
    fun <T, R> List<T>.transform(transformFun: (T) -> R): List<R> {
        //创建一个新的List对象，用于装载转换后的item
        var result = arrayListOf<R>()
        /**
         * 类似java中增强for循环。
         * 扩展函数中的this指向接受者对象，也就是该调用扩展函数的对象
         */
        for (item in this) {
            var newItem = transformFun(item)// 调用参数中的函数方法进行转换新的item.
            result.add(newItem)
        }
        return result
    }

    class D {
        fun bar() {}
    }

    /**
     * 给类D扩展了一个方法add
     */
    fun D.add(s: String): Int {
        /**
         * 调用接受者的方法
         */
        bar()
        return 100
    }
    //C为分发接收者
    class C {
        fun baz() {}
        fun bar(){}
        /**
         * 在一个类内部给D类扩展了foo()函数,D为扩展接收者
         */
        fun D.foo() {
            bar()   // 调用 D.bar
            baz()   // 调用 C.baz
            //  对于分发接收者与扩展接收者的成员名字冲突的情况，扩展接收者优先。要引用分发接收者的成员你可以使用 限定的 this 语法。
            toString()         // 调用 D.toString()
            this@C.toString()  // 调用 C.toString()
        }

        fun caller(d: D) {
            d.foo()   // 调用扩展函数
        }
    }

    //List属性扩展
    /**
     * 注意：由于扩展没有实际的将成员插入类中，因此对扩展属性来说幕后字段是无效的。这就是为什么扩展属性不能有初始化器。他们的行为只能由显式提供的 getters/setters 定义。
     */
    val <T> List<T>.lastIndex: Int
        get() = size - 1

}