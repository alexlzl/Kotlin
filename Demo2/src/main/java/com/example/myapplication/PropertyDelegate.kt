package com.example.myapplication

import kotlin.reflect.KProperty

/**
 * @ describe 属性委托
 * 一些常见的属性类型，虽然我们可以在每次需要的时候手动实现它们，
 * 但是如果能够为大家把他们只实现一次并放入一个库会更好
 *
 * 延迟属性（lazy properties）: 其值只在首次访问时计算；
可观察属性（observable properties）: 监听器会收到有关此属性变更的通知；
把多个属性储存在一个映射（map）中，而不是每个存在单独的字段中。
为了涵盖这些（以及其他）情况，Kotlin 支持 委托属性:
 *
 * 语法是： val/var <属性名>: <类型> by <表达式>。在 by 后面的表达式是该 委托，
 * 因为属性对应的 get()（与 set()）会被委托给它的 getValue() 与 setValue() 方法。
 * 属性的委托不必实现任何的接口，但是需要提供一个 getValue() 函数（与 setValue()——对于 var 属性）。
 * @author lzl
 *
 * @ time 2018/11/12 18:40
 *
 *
 */
class PropertyDelegate {
    var delegate: String by DelegateTest()

}

class DelegateTest {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}