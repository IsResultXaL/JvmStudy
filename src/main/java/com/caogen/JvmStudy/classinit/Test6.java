package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 18:14
 */
public class Test6 {

    public static void main(String[] args) {
        //当用数组去引用类，并不会类初始化
        MyChild[] myChildren = new MyChild[2];

        //当调用类的常量，并不会类初始化，类的常量会被JVM加载到常量池
        System.out.println("my child str ==" + MyChild.childStr);
    }

}
