package com.example.myapplication

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/23 17:51
 *
 *
 */
class AnnotationTest {
    companion object {
        /**
         * Instructs the Kotlin compiler not to generate getters/setters for this property and expose it as a field.
         */
        @JvmField
                /**
                 * Specifies that an additional static method needs to be generated from this element if it's a function.
                 * If this element is a property, additional static getter/setter methods should be generated.
                 */
        //@JvmStatic
        var name: String = ""
    }
}