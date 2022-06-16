package com.caogen.JvmStudy.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-15 12:23
 */
public class MyClassVisitor extends ClassVisitor {

    public MyClassVisitor(ClassVisitor classVisitor) {
        super(Opcodes.ASM7, classVisitor);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        cv.visit(version, access, name, signature, superName, interfaces);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = cv.visitMethod(access, name, descriptor, signature, exceptions);
        if (!"<init>".equals(name) && mv != null) {
            //为这样的方法增加记录方法执行时间功能
            mv = new MyMethodVisitor(mv);
        }
        return mv;
    }
}
