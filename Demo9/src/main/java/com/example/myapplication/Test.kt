package com.example.myapplication

import java.math.BigInteger

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/11/23 15:31
 *
 *
 */

class TestStatic {
    private var otherField = 0

    companion object {
        val BIG_INTEGER = BigInteger.ONE
        var name="alex"

        fun method() {
            println("call method")
        }
    }
}
