package com.caogen.JvmStudy.gc;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-24 10:58
 */
public class User {

    private byte[] bytes = new byte[100 * 1024];

    private String userId;

    public User(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("now finalize userId = " + userId);
    }
}
