package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
fun Thread.add(){
    println("hello world")

}
class MainActivity : AppCompatActivity() {

//    var btn:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btn=findViewById(R.id.button1)
        button1.text="test"
    }

    fun test1(view : View){
        if(view is Button){
            view.text=TestObject.name+"age=="+TestObject.getAge()
        }

    }

    fun test2(view : View){
        if(view is Button){
            view.text=TestObject1.TestI.name+"age=="+TestObject1.TestI.getAge()
        }

    }
    fun test3(view : View){
        if(view is Button){
            view.text=TestObject1.name
        }

    }
    fun test4(view : View){
        if(view is Button){
            view.text=(MyClass2.CompanionName.INNER_PARAMETER == MyClass2.INNER_PARAMETER).toString()+"==="+(MyClass3.Companion.INNER_PARAMETER == MyClass3.INNER_PARAMETER).toString()
        }

    }

    fun test5(view : View){
        if(view is Button){
            view.text=operateClass(TestObject5.Imp)
            fun TestObject5.Imp.add(){
                println(INNER_PARAMETER)
            }
            TestObject5.Imp.add()
        }

    }

    fun test6(){
        TestObject11().sex
        //定义的是TestObject11的伴生对象
       var o= TestObject11
        o.name
        o.testName()
    }
}
