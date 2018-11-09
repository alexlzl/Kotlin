package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    private var s: String? = "100"
    private lateinit var ss: String
    private var i: Int = 100;
    private lateinit var student: Student
    private var name: String? = null
    var b: String? = "abc" //String? 表示该 String 类型变量可为空


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        s=null
//        tv.text = student.name
        button1.setOnClickListener {
            //如果S为空则抛出异常 ==== kotlin.KotlinNullPointerException，不为空执行length.toString()
            button1.text = s!!.length.toString()
            //如果S为空则返回NULL，不为空执行length.toString()
            button1.text = s?.length.toString()
        }
        b = null // 编译通过
        button2.setOnClickListener {
            if (b != null) {
                print("String of length ${b?.length}")
            } else {
                print("Empty string")
                Toast.makeText(this, "test", Toast.LENGTH_LONG).show()
            }

        }
        button3.setOnClickListener {
            var str: String? = "test"
            button3.text = str
//            repeat(3,{Toast.makeText(this,"t",Toast.LENGTH_LONG).show()})
//            require(str?.length !!>0,{Toast.makeText(this,"t",Toast.LENGTH_LONG).show()})
            neverEmpty("abc")
        }
    }

    fun neverEmpty(str: String?) {
        require(str?.length!! > 0, { "String should not be empty" })
        println(str)
    }

    fun main(args: Array<String>) {
        System.out.print("===")
    }

    /**
     * 空的安全调用
     */
    fun test1() {
        var str: String
    }

}
