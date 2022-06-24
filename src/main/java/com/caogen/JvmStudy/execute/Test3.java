package com.caogen.JvmStudy.execute;

/**
 * @Author 康良玉
 * @Description
 * 静态分派：所有依赖静态类型来定位方法执行版本的分派方式,比如 重载方法
 * @Create 2022-06-24 10:20
 */
public class Test3 {

    public void t1(int a) {
        System.out.println("Test3 t1(int) a = " + a);
    }

    public void t1(String a) {
        System.out.println("Test3 t1(String) a = " + a);
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.t1(1);
        test3.t1("a");
    }

}
