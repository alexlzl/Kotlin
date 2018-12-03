package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/3 14:43
 *
 *
 */

class Test {
    fun test() {
        val a = arrayOf("a", "b", "c")
        val numValue: Int = 128
        val numValueBox: Int? = numValue

/*
    比较两个数字
 */
        var result: Boolean
        result = numValue == numValueBox
        println("numValue == numValueBox => $result")  // => true,其值是相等的

        result = numValue === numValueBox
/*
  上面定义的变量是Int类型，大于127其内存地址不同，反之则相同。
  这是`kotlin`的缓存策略导致的，而缓存的范围是` -128 ~ 127 `。
  故，下面的打印为false
*/
        println("numValue === numValueBox => $result")//false
    }


    /**
     * 显示转换==================================
     *
     * 较小的类型不会被隐式转换为更大的类型，故而系统提供了显式转换。提供的显式转换方法如下：
    toByte() => 转换为字节型
    toShort() => 转换为短整型
    toInt() => 转换为整型
    toLong() => 转换为长整型
    toFloat() => 转换为浮点型
    toDouble() => 转换为双精度浮点型
    toChar() => 转换为字符型
    toString() => 转换为字符串型
     */
    fun test1() {
        var numA: Int = 97
        println(numA.toByte())
        println(numA.toShort())
        println(numA.toInt())
        println(numA.toLong())
        println(numA.toFloat())
        println(numA.toDouble())
        println(numA.toChar())
        println(numA.toString())
    }


    /**
     * 隐式转换===============
     * 类型是从上下文推断出来的，即算术运算则被重载为适当的转换
     */
    fun test2() {
// 30L + 12 -> Long + Int => Long
        val num = 30L + 12
        println(num.toString() + "==============")
    }

    /**
     * 位运算符
     *
     *
     * Kotlin中对于按位操作，和Java是有很大的差别的。Kotlin中没有特殊的字符，但是只能命名为可以以中缀形式调用的函数，下列是按位操作的完整列表(仅适用于整形（Int）和长整形（Long）)：
    shl(bits) => 有符号向左移 (类似Java的<<)
    shr(bits) => 有符号向右移 (类似Java的>>)
    ushr(bits) => 无符号向右移 (类似Java的>>>)
    and(bits) => 位运算符 and (同Java中的按位与)
    or(bits) => 位运算符 or (同Java中的按位或)
    xor(bits) => 位运算符 xor (同Java中的按位异或)
    inv() => 位运算符 按位取反 (同Java中的按位取反)

     */
    fun test3() {
        /*
   位运算符
   支持序列如下：shl、shr、ushr、and、or、xor、inv
*/
        var operaNum: Int = 4

        var shlOperaNum = operaNum shl (2)
        var shrOperaNum = operaNum shr (2)
        var ushrOperaNum = operaNum ushr (2)
        var andOperaNum = operaNum and (2)
        var orOperaNum = operaNum or (2)
        var xorOperaNum = operaNum xor (2)
        var invOperaNum = operaNum.inv()

        println("shlOperaNum => $shlOperaNum \n " +
                "shrOperaNum => $shrOperaNum \n " +
                "ushrOperaNum => $ushrOperaNum \n " +
                "andOperaNum => $andOperaNum \n " +
                "orOperaNum => $orOperaNum \n " +
                "xorOperaNum => $xorOperaNum \n " +
                "invOperaNum => $invOperaNum")
    }


    /**
     * 逻辑操作符（与Java相同）
    ' || ' => 逻辑或（或者）
    ' && ' => 逻辑与（并且）
    ' ! ' => 逻辑非（取反）
    输出结果
    I/System.out: a || b => true
    I/System.out: !a => true
    I/System.out: !b => false
     */
    fun test4() {
        /*
    操作运算符
    ' || ' => 逻辑或（或者）
    ' && ' => 逻辑与（并且）
    ' ! ' => 逻辑非（取反）
       */
        var a: Boolean = false
        var b: Boolean = true
        var result: Boolean

/* 逻辑或操作 */
        if (a || b) {
            result = a || b
            println("a || b => $result")
        }

/* 逻辑与操作 */
        if (a && b) {
            result = a && b
            println("a && b => $result")
        }

/* 逻辑非操作 */
        result = !a
        println("!a => $result")

        result = !b
        println("!b => $result")
    }

    /**
     * 字符型的变量不仅可以转换为数字，同时也可转换为其他类型
     */
    fun test5() {
        var char1: Char = 'a'
//char1 = 1        => 这句代码会直接出错
        println("char1 => $char1")
        var var1 = char1.toByte()
        var var2 = char1.toInt()
        var var3 = char1.toString()
        var var4 = char1.toFloat()
        var var5 = char1.toShort()
        println("var1 => $var1 \n var2 => $var2 \n var3 => $var3 \n var4 => $var4 \n var5 => $var5")
    }

    fun test6() {
        /*
   当字符变量为英文字母时，大小写的转换
*/
        var charA: Char = 'a'
        var charB: Char = 'B'
        var charNum: Char = '1'
        var result: Char

// 转换为大写
        result = charA.toUpperCase()
        println("result => $result")

// 转换为小写
        result = charB.toLowerCase()
        println("result => $result")

//当字符变量不为英文字母时，转换无效
        result = charNum.toLowerCase()
        println("result => $result")
    }

    /**
     * 字符转义
     *
     *
     * 字符转义
    同Java一样，使用某些特殊的字符时，要使用转义。下列是支持的转义序列：
    \t => 表示制表符
    \n => 表示换行符
    \b => 表示退格键（键盘上的Back建）
    \r => 表示键盘上的Enter键
    \\ => 表示反斜杠
    \' => 表示单引号
    \" => 表示双引号
    \$ => 表示美元符号，如果不转义在kotlin中就表示变量的引用了
    其他的任何字符请使用Unicode转义序列语法。例：'\uFF00'
     */
    fun test7() {
        println("\n  换行\n符")
        println("\t  制表\t符")
        println(" \b  退格\b键")
        println("\r  Enter键同样换行")
        println('\\')
        println('\'')
        println('\"')
        println('\$')
        println('\uFF01')
    }

    /**
     * String表示字符串类型。其是不可变的。
     * 所以字符串的元素可以通过索引操作的字符：str[index]来访问。
     * 可以使用for循环迭代字符串： 其中str[index]中的str为要目标字符串，index为索引
     */
    fun test8() {
        val str: String = "kotlin"
        println("str => ${str[1]}")
        //迭代
        for (s in str) {

            println(s)
            println("\t")
        }
    }


    /**
     * 字符串字面量
     *
     * Kotlin中， 字符串字面量有两种类型：
    包含转义字符的字符串 转义包括（\t、\n等）,不包含转义字符串的也同属此类型
    包含任意字符的字符串 由三重引号（""" .... """）表示
     */
    fun test9() {
        // 类型1：
        var str1: String = "hello\t\tkotlin fun main(args: Array<String>){\n" +
                "    println(\"我是三重引号引用的字符串，我可以包含任意字符\")\n" +
                "    }"
        println(str1)
        str1 = "hello kotlin"
        println(str1)

// 类型2：
        val str2 = """ fun main(args: Array<String>){
    println("我是三重引号引用的字符串，我可以包含任意字符")
    } """
        println(str2)
    }


    /**
     * 使用字符串模板的符号为（$）。在$符号后面加上变量名或大括号中的表达式
     */
    fun test10() {
        val text1: String = "我来了！"
        var text2: String = "$text1 kotlin"
        var text3: String = "$text2 ${text1.length} 哈哈！！！！"
        println(text1)
        println(text2)
        println(text3)
    }

    /**
     * 创建一个数组，参数是一个可变参数的泛型对象
     */
    fun test11() {
        var arr1 = arrayOf(1, 2, 3, 4, 5) //等价于[1,2,3,4,5]
        for (v in arr1) {
            print(v)
            print("\t")
        }

        var arr2 = arrayOf("0", "2", "3", 'a', 32.3f)
        for (v in arr2) {
            print(v)
            print("\t")
        }
    }

    /**
     * 用于创建一个指定数据类型且可以为空元素的给定元素个数的数组
     */
    fun test12() {
        var arr3 = arrayOfNulls<Int>(3)

//如若不予数组赋值则arr3[0]、arr3[1]、arr3[2]皆为null
        for (v in arr3) {
            print(v)
            print("\t")
        }

        println()

//为数组arr3赋值
        arr3[0] = 10
        arr3[1] = 20
        arr3[2] = 30

        for (v in arr3) {
            print(v)
            print("\t")
        }
    }

    /**
     * 工厂函数
       使用一个工厂函数Array()，它使用数组大小和返回给定其索引的每个数组元素的初始值的函数。
       Array() => 第一个参数表示数组元素的个数，第二个参数则为使用其元素下标组成的表达式
     */
    fun test13() {
        var arr4 = Array(5, { index -> (index * 2).toString() })
        for (v in arr4) {
            print(v)
            print("\t")
        }
    }


    /**
     * Kotlin还有专门的类来表示原始类型的数组，没有装箱开销，它们分别是：
    ByteArray => 表示字节型数组
    ShortArray => 表示短整型数组
    IntArray => 表示整型数组
    LongArray => 表示长整型数组
    BooleanArray => 表示布尔型数组
    CharArray => 表示字符型数组
    FloatArray => 表示浮点型数组
    DoubleArray => 表示双精度浮点型数组
    PS: Kotlin中不支持字符串类型这种原始类型数组，可以看源码Arrays.kt这个类中并没有字符串数组的声明。而源码中StringArray.kt这个类并不是声明字符串型数组的。
     */
    fun test14(){
        var intArr: IntArray = intArrayOf(1,2,3,4,5)
        for (number in intArr){
            print(number)
            print("\t")
        }

        println()

        var charArr: CharArray = charArrayOf('a','1','b','c','3','d')
        for (char in charArr){
            print(char)
            print("\t")
        }

        println()

        var longArr: LongArray = longArrayOf(12L,1254L,123L,111L)
        for (long in longArr){
            print(long)
            print("\t")
        }
    }


}