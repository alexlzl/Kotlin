package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.net.HttpURLConnection

class MainActivity : AppCompatActivity() {
    private val TAG: String = this.javaClass.name + "测试输出"
    private var btn: Button? = null
    private var s: String? = "100"
    private lateinit var ss: String
    private var i: Int = 100;
    private lateinit var student: Student
    private var name: String? = null
    lateinit var sss:String
    var b: String? = null //String? 表示该 String 类型变量可为空
    var http: HttpURLConnection? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            //            test3()
//            test4("alex")
//            button1.text=test5()
//            test6()
//            button1.text = test7()
            button1.text = test8()
        }

        button2.setOnClickListener {


        }
        button3.setOnClickListener {

        }
    }


    /**
     * Elvis 操作符===================
     */
    fun test2() {
        val b: String? = null
        //当我们有一个可空的引用 b 时，我们可以说 如果 b 非空，我使用它；否则使用某个非空的值 x，使用代码表示就是：
        val bLength: Int = if (b != null) b.length else -1
        /**
         *
         * 除了完整的 if 表达式，这还可以通过 Elvis 操作符表达，写作 ?:
         *
         * 在这里，如果 ?: 左侧表达式非空，elvis 操作符就调用其左侧表达式，否则调用右侧表达式。
         * 值得注意的是，当且仅当左侧为空时，才会对右侧表达式求值。
         */
        val bLength1 = b?.length ?: -1
    }

    /**
     * !! 操作符=======================
     */
    fun test3() {
        //这种选择是为 NPE 爱好者准备的。我们可以写 b!! ，表示 如果 b 非空则返回 b，否则就会抛出一个 NPE 异常：kotlin.KotlinNullPointerException
//        val bLength = b!!.length
        //这种写法如果为空不抛出异常,返回NULL
        val str = b?.toUpperCase()
        val bLength = b?.length
        Log.e(TAG, bLength.toString())
    }

    //when的使用，相当于java的switch====================================
    fun test4(name: String) {
        when (name) {
            "alex" -> Log.e(TAG, "alex")
            "jim" -> Log.e(TAG, "jim")
            else -> Log.e(TAG, "else")
        }

        /**
         * 在java中是没有""",这样的符号
         */
        val text = """
    Tell me and I forget.
    Teach me and I remember.
    Involve me and I learn.
    (Benjamin Franklin).
    """.trimMargin()
        print(text)


    }

    /**
     * 初始化一个不可为空的变量
    在 Kotlin 中，我们需要预先定义好一个变量是否可为空。
    这使得编译器能在编译时识别出潜在的 null 对象，以避免 NPE （空指针异常）。
    因此，对于一个 不可为空 的成员变量，当类被创建时，它必须要被赋予一个非空的值。
    如果在类被创建时，初始化这个成员变量的所有依赖对象都已经准备好，那当然就不是问题了。
    不幸的是，有些情况下，这些依赖对象（例如上述例子中的 param1 和 param2）在运行时才可用。
    这么一来，我们就陷入困境了，因为我们没法让这个变量在初始化时先赋值为 null（Kotlin 不允许我们这么做），而我们又需要等到相关依赖对象都准备好了才能给它初始化。
    基于这种情况，lateinit（延迟初始化模式） 给我们带来了便利，Kotlin 以优雅的方式允许一个成员变量在定义时是未初始化的，之后当一切准备就绪了再执行它的初始化。
     */
    lateinit var str: String

    /**
     * 延迟初始化
     */
    fun test5(): String {
        str = "test==="
        return str
    }

    /**
     * 懒初始化
     */
    val name1 by lazy {
        Log.e(TAG, "初始化")
        "alex"

    }

    /**
     * 懒初始化===================
     */
    fun test6() {
//        val name by lazy {
//            Log.e(TAG, "初始化")
//            "alex"
//
//        }
        Log.e(TAG, name1)

    }

    /**
     * 全局函数测试
     * 引入的时候可以直接使用import xxx.全局函数，这个跟java的不同；
     *
     * 如果不同的包作用域下，有“同名”的全局函数，则需要引入全局函数的全局路径即可；
     */
    fun test7(): String {
        com.example.myapplication.child1.testOverAllFun()
        return testOverAllFun()
    }

    /**
     * 静态功能实现
     */
    fun test8(): String {
       var testSingle: TestCompanionObject.TestSingle =TestCompanionObject.TestSingle
        println(testSingle.hashCode())
        println(TestCompanionObject.TestSingle.hashCode())
        return TestCompanionObject.testStatic()+TestCompanionObject.staticstr+TestCompanionObject.TestSingle
    }
}
