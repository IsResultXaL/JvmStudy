package com.caogen.JvmStudy.execute;

/**
 * @Author 康良玉
 * @Description javap -verbose target.classes.com.caogen.JvmStudy.execute.Test1
 * @Create 2022-06-23 18:08
 */
public class Test1 {
    /**
     * slot
     * 0 this
     * 1 a
     * 2 b
     * 3 c
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    /**
     * slot 静态方法的本地变量表0位索引不是this
     * 0 a
     * 1 b
     * 2 c
     *
     * @param a
     * @param b
     * @return
     */
    public static int add2(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        {
            byte[] bs = new byte[2 * 1024 * 1024];
        }
        // slot
        // 0 args
        // 1--bs 堆的空间，放着2M的数据

        // slot是复用的
        // 0 args
        // 1 a (之前1索引指向的是bs，如果没有a这个变量，1索引还是会指向bs，bs不会被gc回收)
        int a = 3;

        System.gc();

        System.out.println("totalMemory: " + Runtime.getRuntime().totalMemory() / 1024.0 / 1024.0);
        System.out.println("freeMemory: " + Runtime.getRuntime().freeMemory() / 1024.0 / 1024.0);
        System.out.println("maxMemory: " + Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0);
    }

}
