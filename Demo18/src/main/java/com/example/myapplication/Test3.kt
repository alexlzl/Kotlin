package com.example.myapplication

/**
 * @ describe  密封类是为 继承 设计的，是一个抽象类；
 * 密封类的子类是确定的，除了已经定义好的子类外，它不能再有其他子类
 *
 * @author lzl
 *
 * @ time 2018/11/28 18:33
 *
 *
 */
/**
 * 现实世界里存在许多密封类的例子，比如根据年龄，可以把人（Person）分为成人（Adult）和儿童（Child）；
 * 根据大小，把整数（Integer）分为正数（PositiveInteger）、负数（NegativeInteger）和零（Zero）。
 * 可以发现，它们都属于 可以把元素地划分到几个确定的子类 的类，密封类就是专门为这种类提供的封装，可以看作封装类的枚举。
 *
 * 需要注意，
 因为密封类是一个抽象类，所以不能用 data 等非抽象类的修饰符来修饰它，也不用加 open 关键字。
 密封类的子类，要么写在密封类内部，要么写在父类同一个文件里，不能出现在其他地方。但子类的子类可以出现在其他地方。
 */
sealed class Test3 {

}

