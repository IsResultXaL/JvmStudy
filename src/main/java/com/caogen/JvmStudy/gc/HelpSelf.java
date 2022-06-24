package com.caogen.JvmStudy.gc;

/**
 * @Author 康良玉
 * @Description gc自救
 * @Create 2022-06-24 15:16
 */
public class HelpSelf {

    private static HelpSelf hs = null;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("now in finalize");

        //对象自救
        hs = this;
    }

    public static void main(String[] args) throws Exception {
        hs = new HelpSelf();

        //第一次
        hs = null;
        System.gc();
        Thread.sleep(1000L);
        //如果hs有值，说明gc的时候进入finalize方法了，然后自救成功
        System.out.println("first hs = " + hs);

        //第二次
        hs = null;
        System.gc();
        Thread.sleep(1000L);
        //如果hs没有值，说明直接gc，没有自救成功
        System.out.println("second hs = " + hs);
    }
}
