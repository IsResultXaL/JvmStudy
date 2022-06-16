package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 17:29
 */
public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {
        //访问某个类或者接口的静态变量会主动进行类的初始化
        System.out.println("my child a ==" + MyChild.a);

        //访问某个类的静态方法会主动进行类的初始化
        MyChild.t2();

        //反射某个类会主动进行类的初始化
        Class class1 = Class.forName("com.caogen.JvmStudy.classinit.MyChild");
    }

}
