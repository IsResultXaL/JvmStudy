package com.caogen.JvmStudy.classinit;

import com.caogen.JvmStudy.classloader.MyClassLoader;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 17:29
 */
public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //如果类存在父类，且父类没有初始化，就先初始化父类
        MyChild myChild = new MyChild();

        //只有当程序首次使用接口里面的变量或者是调用接口方法的时候，才会导致接口初始化
        System.out.println("my child str==" + myChild.str);

        //调用ClassLoader类的loadClass方法来装载一个类，并不会初始化这个类
        MyClassLoader myClassLoader = new MyClassLoader("myClassLoader1");
        Class class1 = myClassLoader.loadClass("com.caogen.JvmStudy.classinit.MyChild");
        System.out.println("over-------");
    }

}
