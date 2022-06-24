package com.caogen.JvmStudy.execute;

/**
 * @Author 康良玉
 * @Description 动态分派：根据运行期的实际类型来定位方法执行版本的分派方式，比如 覆盖方法
 * @Create 2022-06-24 10:26
 */
public class Test4 extends Test3{

    @Override
    public void t1(int a) {
        System.out.println("Test4 t1(int) a = " + a);
    }

    @Override
    public void t1(String a) {
        System.out.println("Test4 t1(String) a = " + a);
    }

    public static void main(String[] args) {
        Test3 test3 = new Test4();
        test3.t1(1);
        test3.t1("a");
    }

}
