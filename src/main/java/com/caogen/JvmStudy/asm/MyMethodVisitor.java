package com.caogen.JvmStudy.asm;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-15 15:01
 */
public class MyMethodVisitor extends MethodVisitor {
    public MyMethodVisitor(MethodVisitor methodVisitor) {
        super(Opcodes.ASM7, methodVisitor);
    }

    @Override
    public void visitCode() {
        mv.visitCode();

        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/caogen/JvmStudy/asm/MyTimeLogger", "start", "()V", false);
    }

    @Override
    public void visitInsn(int opcode) {

        if ((opcode >= Opcodes.IRETURN && opcode <= Opcodes.RETURN) || opcode == Opcodes.ATHROW) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/caogen/JvmStudy/asm/MyTimeLogger", "end", "()V", false);
        }
        mv.visitInsn(opcode);
    }
}
