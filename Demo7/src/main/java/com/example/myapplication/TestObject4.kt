package com.example.myapplication

/**
 * @ describe
 *
 * 和 object 不同， companion object 的定义完全属于类的本身，所以 companion object 肯定是不能脱离类而定义在全局之中。
 * 它就像 Java 里的 static 变量，所以我们定义 companion object 变量的时候也一般会使用大写的命名方式。
 * 同时，和 object 类似，可以给 companion object 命名，也可以不给名字，这个时候它会有个默认的名字： Companion ，而且，它只在类里面能定义一次：
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
    /**
     * 不给名字默认是Companion
     */
    companion object {
        val INNER_PARAMETER = "can only be inner"
    }

    object Name {
        val name="alex"
    }
}