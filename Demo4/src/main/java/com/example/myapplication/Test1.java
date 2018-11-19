package com.example.myapplication;

/**
 * @author lzl
 * @ describe
 * @ time 2018/11/16 16:48
 */
public class Test1<T extends Object> {

    public static void main(String[] args){
//        List<String> strs = new ArrayList<String>();
//        List<Object> objs = strs; // ！！！即将来临的问题的原因就在这里。Java 禁止这样！
//        objs.add(1); // 这里我们把一个整数放入一个字符串列表
//        String s = strs.get(0); // ！！！ ClassCastException：无法将整数转换为字符串

    }
    void demo(Test1<String > strs) {
//        Test1<Object> objects = strs; // ！！！在 Java 中不允许
        // ……
    }
}
