package com.caogen.JvmStudy.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-15 17:14
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader("com/caogen/JvmStudy/asm/CC");

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);

        ClassVisitor cv = new MyClassVisitor(cw);

        cr.accept(cv, ClassReader.SKIP_DEBUG);

        byte[] data = cw.toByteArray();

        // 输出

        File f = new File("target/classes/com/caogen/JvmStudy/asm/CC.class");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(data);
        fos.close();
    }

}
