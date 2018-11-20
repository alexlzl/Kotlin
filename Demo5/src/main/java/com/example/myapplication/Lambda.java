package com.example.myapplication;

/**
 * @author lzl
 * @ describe
 * @ time 2018/11/20 10:42
 */
public class Lambda {

    public static void main(String[] args){
        get((str, age)->{ System.out.print("");System.out.print("abc");});

    }

    public static void  get(TestInter testInter){

    }

    interface TestInter{
        void test(String str,int age);
    }
}
