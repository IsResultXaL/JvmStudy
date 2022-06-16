package com.caogen.JvmStudy.classinit;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 18:03
 */
public class Test4 {

    public static void main(String[] args) {
        // 类初始化加载的时候给a和b都加了1(这个时候a和b一样，都没有赋值，默认都是0)
        // 然后执行到private static int a = 0这句代码的时候给a又赋值为0了
        MyClassA myClassA = MyClassA.getInstance();
        System.out.println("myClassA a ==" + myClassA.getA());
        System.out.println("myClassA b ==" + myClassA.getB());
    }

}
