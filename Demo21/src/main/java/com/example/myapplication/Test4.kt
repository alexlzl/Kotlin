package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/30 14:13
 *
 *
 */

/**
 * Set、Map集合的协变和上面的代码都相差不多，调用不同的转换函数罢了。
 * 除了toMutableList()函数以外，还有着toList()、toHashSet()、toSet()等等函数。
 * 这些函数都是在Iterable接口的拓展函数。大家有兴趣可以自己去看看源码，这里不做详细的累述。
 */
class Test4 {
    fun test() {
        open class Person(val name: String, val age: Int) {
            override fun toString(): String {
                return "Person(name='$name', age=$age)"
            }
        }

        class Student(name: String, age: Int, cls: String) : Person(name, age)

// 注意：Any是kotlin中的超类，故而Student类也是继承自Any的。这里你可以换成Person类结果是相同的
        var listPerson: List<Any>
        val listStudent: List<Student> = listOf(Student("张三", 12, "一班"), Student("王五", 20, "二班"))
        listPerson = listStudent

        listPerson.forEach { println(it.toString()) }


    }

    fun test1() {
        open class Person(val name: String, val age: Int) {
            override fun toString(): String {
                return "Person(name='$name', age=$age)"
            }
        }

        class Student(name: String, age: Int, cls: String) : Person(name, age)

        var mutableListPerson: MutableList<Person>
        val mutableListStudent: List<Student> = listOf(Student("张三", 12, "一班"), Student("王五", 20, "二班"))
        mutableListPerson = mutableListStudent.toMutableList()
        mutableListPerson.add(Person("a", 15))
        mutableListPerson.add(Person("b", 45))

        mutableListPerson.forEach { println(it.toString()) }


    }
}