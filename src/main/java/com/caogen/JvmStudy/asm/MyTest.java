package com.caogen.JvmStudy.asm;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-15 17:21
 */
public class MyTest {

    public static void main(String[] args) {
        CC cc = new CC();
        try {
            cc.m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
