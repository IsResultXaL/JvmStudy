package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 17:34
 */
public interface API {

    public static String str = "now in api";

    public void t1();

    // 定义了default方法的接口，接口会实现类的初始化
    public default void t3() {
        System.out.println("now in api t3()");
    }
}
