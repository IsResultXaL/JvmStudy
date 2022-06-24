package com.caogen.JvmStudy.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 康良玉
 * @Description 软引用, 内存足够不会被gc，内存不够会把gc
 * @Create 2022-06-24 10:56
 */
public class SoftReferenceType {

    private static ReferenceQueue<User> rq = new ReferenceQueue<>();

    private static void printQueue(String str) {
        Reference<? extends User> obj = rq.poll();
        if (obj != null) {
            System.out.println("the gc Object reference = " + str + " = " + obj.get());
        }
    }

    private static void testSoftReference() throws Exception {
        List<SoftReference<User>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            SoftReference<User> userSoftReference = new SoftReference<>(new User("soft " + i), rq);

            System.out.println("now the soft user = " + userSoftReference.get());

            list.add(userSoftReference);
        }

        System.gc();

        Thread.sleep(1000L);

        printQueue("soft");
    }

    public static void main(String[] args) throws Exception {
        testSoftReference();
    }

}
