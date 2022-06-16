package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 17:29
 */
public class Test3 {

    static {
        //JVM启动的时候运行的主类会进行类的初始化
        System.out.println("now test class init");
    }

    public static void main(String[] args) throws ClassNotFoundException {

    }

}
