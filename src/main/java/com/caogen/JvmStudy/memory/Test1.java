package com.caogen.JvmStudy.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 康良玉
 * @Description
 * -XX:+UseConcMarkSweepGC -XX:+HeapDumpOnOutOfMemoryError -Xms10m -Xmx10m -Xmn3m -Xlog:gc+heap=debug:logs/gc.log
 * @Create 2022-06-22 12:28
 */
public class Test1 {

    private byte[] bs = new byte[1024 * 1024];

    public static void main(String[] args) {

        List<Test1> list = new ArrayList<>();

        int num = 0;
        try {
            while (true) {
                list.add(new Test1());
                num++;
            }
        } catch (Throwable err) {
            System.out.println("now error, num = " + num);
            err.printStackTrace();
        }

        System.out.println("totalMemory: " + Runtime.getRuntime().totalMemory() / 1024.0 / 1024.0);
        System.out.println("freeMemory: " + Runtime.getRuntime().freeMemory() / 1024.0 / 1024.0);
        System.out.println("maxMemory: " + Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0);
    }

}
