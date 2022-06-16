package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 17:28
 */
public class MyParent {

    public static String parentStr = "parentStr";

    static {
        System.out.println("my parent class init");
    }

}
