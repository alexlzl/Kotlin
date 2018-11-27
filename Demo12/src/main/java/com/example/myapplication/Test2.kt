package com.example.myapplication

/**
 * @ describe Greeter类的greet()方法是不能访问name的。
 * 因为没有加val或者var，就相当于Greeter类是没有name这个属性的，只是它的构造函数有个name参数而已。
 * 下面是反编译后的java代码
 *
 * @author lzl
 *
 * @ time 2018/11/27 13:50
 *
 *
 */

//如果主构造函数的参数没有被var或者val修饰时，生成的java代码中并不包含该属性，所以greet()函数直接调用name会编译异常
class Greeter(name: String) {
    var n = name

    init {
        println("Hello, $name")
    }

    fun greet() {
        //name是无法直接访问的
//        println("Hello, ${name}")
        print(n)
    }
}

/**
 * public final class Greeter {
@NotNull
private String n;

@NotNull
public final String getN() {
return this.n;
}

public final void setN(@NotNull String var1) {
Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
this.n = var1;
}

public final void greet() {
String var1 = this.n;
System.out.print(var1);
}

public Greeter(@NotNull String name) {
Intrinsics.checkParameterIsNotNull(name, "name");
super();
this.n = name;
String var2 = "Hello, " + name;
System.out.println(var2);
}
}
 */

/**
 * 如果主构造函数的参数被声明为val或者var 生成的java代码对应的是一个类的属性
 */
class Greeter1(private val name1: String) {
    fun greet() {
        println("Hello, $name1  world")
    }
}

/**
 * public final class Greeter1 {
private final String name1;

public final void greet() {
String var1 = "Hello, " + this.name1 + "  world";
System.out.println(var1);
}

public Greeter1(@NotNull String name1) {
Intrinsics.checkParameterIsNotNull(name1, "name1");
super();
this.name1 = name1;
}
}
 */

