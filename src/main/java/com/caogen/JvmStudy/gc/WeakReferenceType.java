package com.caogen.JvmStudy.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 康良玉
 * @Description 弱引用 的对象 通常是短生命周期的，因此在GC时，垃圾回收器只要发现了弱引用，不管内存是否足够，都会回收。不过由于垃圾回收的线程优先级较低，可能存在漏回收弱引用的情况。
 * @Create 2022-06-24 10:56
 */
public class WeakReferenceType {

    private static ReferenceQueue<User> rq = new ReferenceQueue<>();

    private static void printQueue(String str) {
        Reference<? extends User> obj = rq.poll();
        if (obj != null) {
            System.out.println("the gc Object reference = " + str + " = " + obj.get());
        }
    }

    private static void testWeakReference() throws Exception {
        List<WeakReference<User>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            WeakReference<User> userWeakReference = new WeakReference<>(new User("weak " + i), rq);

            System.out.println("now the weak user = " + userWeakReference.get());

            list.add(userWeakReference);
        }

        System.gc();

        Thread.sleep(1000L);

        printQueue("weak");
    }

    public static void main(String[] args) throws Exception {
        testWeakReference();
    }

}
