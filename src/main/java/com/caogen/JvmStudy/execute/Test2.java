package com.caogen.JvmStudy.execute;

/**
 * @Author 康良玉
 * @Description
 * @Create 2022-06-23 18:08
 */
public class Test2 {

    /**
     * 0: iload_1
     * 1: iload_2
     * 2: iadd
     * 3: istore_3
     * 4: iload_3
     * 5: ireturn
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        //操作数栈 从下往上看
        //3 -- c=3
        //b=2
        //a=1

        Test2 test2 = new Test2();
        int result = test2.add(1, 2);
        System.out.println("result:" + result);
    }

}
