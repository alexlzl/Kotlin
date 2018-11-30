package com.example.myapplication

/**
 * @ describe 进制数
 *
 * 二进制数
八进制数（Kotlin不支持）
十进制数
十六进制数
 *
 * @author lzl
 *
 * @ time 2018/11/30 16:50
 *
 *
 */

class Test {
    fun test() {
        var g = 0x0F            //十六进制数
        var h = 0b00001011      //二进制数
        var k = 123             //十进制数
// ps：Kotlin不支持八进制数
        println(" g => $g \n h => $h \n k => $k")
        /**
         * 输出结果为：
        g => 15
        h => 11
        k => 123
         */

    }

    /**
     * 数字类型字面常量的下划线
     */
    fun test1() {
        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010

        println("oneMillion => $oneMillion")
        println("creditCardNumber => $creditCardNumber")
        println("socialSecurityNumber => $socialSecurityNumber")
        println("hexBytes => $hexBytes")
        println("bytes => $bytes")
        /**
         * 输出结果为：
        oneMillion => 1000000
        creditCardNumber => 1234567890123456
        socialSecurityNumber => 999999999
        hexBytes => 4293713502
        bytes => 3530134674
         */

    }
}