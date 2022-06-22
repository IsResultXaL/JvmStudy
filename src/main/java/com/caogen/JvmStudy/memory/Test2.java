package com.caogen.JvmStudy.memory;

/**
 * @Author 康良玉
 * @Description
 * -Xss决定了函数调用的深度，你可以设置成1M和2M之后对比
 * @Create 2022-06-22 16:32
 */
public class Test2 {

    private int num = 0;

    private int callMe(int a, int b) {
        num++;
        return callMe(a + num, b);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        try {
            test2.callMe(1, 2);
        } catch (Throwable err) {
            System.out.println("now error, num = " + test2.num);
            err.printStackTrace();
        }

    }

}
