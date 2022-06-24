package com.caogen.JvmStudy.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 康良玉
 * @Description 虚引用，一定会被GC
 * @Create 2022-06-24 10:56
 */
public class PhantomReferenceType {

    private static ReferenceQueue<User> rq = new ReferenceQueue<>();

    private static void printQueue(String str) {
        Reference<? extends User> obj = rq.poll();
        if (obj != null) {
            System.out.println("the gc Object reference = " + str + " = " + obj.get());
        }
    }

    private static void testPhantomReference() throws Exception {
        List<PhantomReference<User>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            PhantomReference<User> userPhantomReference = new PhantomReference<>(new User("phantom " + i), rq);

            System.out.println("now the weak user = " + userPhantomReference.get());

            list.add(userPhantomReference);
        }

        System.gc();

        Thread.sleep(1000L);

        printQueue("phantom");
    }

    public static void main(String[] args) throws Exception {
        testPhantomReference();
    }

}
