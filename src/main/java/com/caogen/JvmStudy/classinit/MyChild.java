package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 17:28
 */
public class MyChild extends MyParent implements API{

    public static int a = 5;

    public final static String childStr = "childStr";

    static {
        System.out.println("my child class init1");
    }

    static {
        System.out.println("my child class init2");
    }

    static {
        System.out.println("my child class init3");
    }

    public static void t2() {
        System.out.println("now in my child t2()");
    }

    @Override
    public void t1() {
        System.out.println("now in my child t1()");
    }
}
