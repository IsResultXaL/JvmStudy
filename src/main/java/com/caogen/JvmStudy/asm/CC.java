package com.caogen.JvmStudy.asm;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-15 12:12
 * java -cp .:lib/asm-7.3.1.jar:lib/asm-util-7.3.1.jar org.objectweb.asm.util.ASMifier target/classes/com/caogen/JvmStudy/asm/CC.class
 */
public class CC {

    public void m1() throws Exception {
        Thread.sleep(100);
    }

}
