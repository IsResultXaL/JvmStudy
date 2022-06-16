package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 18:14
 */
public class Test5 {

    public static void main(String[] args) {
        //子类调用父类的静态变量只会初始化父类，子类不会初始化
        System.out.println("my child parentStr ==" + MyChild.parentStr);
    }

}
