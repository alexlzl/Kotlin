package com.example.demo28

import kotlin.reflect.jvm.isAccessible

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/11 18:08
 *
 *
 */
class Test7 {
    fun test1() {

//        println (Person::class.java.declaredFields.map {
//            it.isAccessible = true
//            "${it.name}: ${it.get(Person())}"
//        }.joinToString(","))

//        println(Person::class.members.map { it.name }.joinToString { "," })
        /**
         * I/System.out: =========name
        I/System.out: =========person
        I/System.out: =========test
        I/System.out: =========test1
        I/System.out: =========equals
        I/System.out: =========hashCode
        I/System.out: =========toString
         */
        for (item in Person::class.members) {

            System.out.println("=========" + item.name)
            if ("test1" == item.name) {
                item.isAccessible = true
                item.call(Person())
            }
        }
    }

    fun test2() {
        val cla = Person::class
        cla.members


    }

    class Person {
        private var name = "alex"
        var person = "jim"
        fun test() {
            System.out.println("do==========test")
        }

        private fun test1() {
            System.out.println("do==========test1")
        }
    }
}