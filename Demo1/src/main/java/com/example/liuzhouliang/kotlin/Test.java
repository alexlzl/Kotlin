package com.example.liuzhouliang.kotlin;

import android.util.Log;

/**
 * @author lzl
 * @ describe
 * @ time 2018/10/12 16:28
 */
public interface Test {
    void test();
    static void show(){
        Log.e("a","===");
    }

    default void add(){
        Log.e("a","===");
    }
}
