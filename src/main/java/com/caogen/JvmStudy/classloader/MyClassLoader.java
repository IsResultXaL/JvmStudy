package com.caogen.JvmStudy.classloader;

import java.io.*;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 15:36
 */
public class MyClassLoader extends ClassLoader {

    private String myName = "";

    public MyClassLoader(String myName) {
        this.myName = myName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {
        byte[] data = null;

        InputStream in = null;
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        className = className.replace(".", "/");
        try {
            in = new FileInputStream(new File("classes/" + className + ".class"));
            int a = 0;
            while ((a = in.read()) != -1) {
                out.write(a);
            }
            data = out.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return data;
    }
}
