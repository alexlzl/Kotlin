package com.example.demo28

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/11 15:47
 *
 *
 */
class Person {

}

class Test6 {
    fun test(person: Person) {
//对象获取
        person.javaClass// javaClass
        person::class.java // javaClass
        val c = person::class
        System.out.println(person::class.java)// class com.example.demo28.Person
        System.out.println("====" + c.toString())//====class com.example.demo28.Person (Kotlin reflection is not available)
//类获取
        Person::class// kClass
        person.javaClass.kotlin// kClass
        (Person::class as Any).javaClass// javaClass
        Person::class.java // javaClass

    }

    /**
     * 从log来看，person.javaClass == person::class.java == Person::class.java
    三者是相同的。但是person.javaClass == Person::class却是不同的。为什么呢？
    原因是在kotlin中的Class与Java不同，kotlin中有一个自己的Class叫做KClass，person::class 和Person::class都是获取kotlin的KClass，所以println(person::class == Person::class) 为true。
    我们可以从kotlin的KClass获取到java的Class,person::class.java就是如此，先获取到kotlin的KClass然后再获取javaClass。
    object/class->kClass->Class
    同样也可以通过java的Class获取kotlin的KClass，person.javaClass.kotlin就是先获取javaClass然后再获取kotlin的KClass
    object/class->Class->KClass
    那么KClass都有些什么用呢？Find Usages 可以看到
     */
    fun test1(person: Person) {
        println(person.javaClass == person::class.java) //true
        println(person.javaClass == Person::class.java)//true
        println(person::class.java == Person::class.java)//true
        //person.javaClass == person::class.java == Person::class.java
        println(person.javaClass == Person::class)//false
        println(person.javaClass.kotlin == Person::class)//true
        println(person::class == Person::class)//true


    }
}