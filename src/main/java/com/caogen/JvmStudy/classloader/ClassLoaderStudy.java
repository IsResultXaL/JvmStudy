package com.caogen.JvmStudy.classloader;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-16 14:53
 */
public class ClassLoaderStudy {

    public static void main(String[] args) throws Exception {
        //启动类加载器
        String str = "Hello Class Loader";
        System.out.println("str class loader==" + str.getClass().getClassLoader());

        //平台类加载器(java9之后有的，java8是扩展类加载器)
        Class driver = Class.forName("java.sql.Driver");
        System.out.println("driver class loader==" + driver.getClassLoader());
        System.out.println("driver parent class loader==" + driver.getClassLoader().getParent());

        //应用程序类加载器
        ClassLoaderStudy classLoaderStudy = new ClassLoaderStudy();
        System.out.println("classLoaderStudy class loader==" + classLoaderStudy.getClass().getClassLoader());
        System.out.println("classLoaderStudy parent class loader=="
                + classLoaderStudy.getClass().getClassLoader().getParent());
        System.out.println("classLoaderStudy parent.parent class loader=="
                + classLoaderStudy.getClass().getClassLoader().getParent().getParent());

        //看看jshell属于哪种类加载器
        Class jshell = Class.forName("jdk.jshell.JShell");
        System.out.println("jshell class loader==" + jshell.getClassLoader());

        //自定义加载器(因为优先会用父级加载器加载的类，所以要把父级加载器加载路径里面的MyClass删除才能看到class1 class loader==com.caogen.JvmStudy.classloader.MyClassLoader)
        MyClassLoader myClassLoader = new MyClassLoader("myClassLoader1");
        Class class1 = myClassLoader.loadClass("com.caogen.JvmStudy.classloader.MyClass");
        System.out.println("class1 class loader==" + class1.getClassLoader());
        System.out.println("class1 parent class loader==" + class1.getClassLoader().getParent());
    }

}
