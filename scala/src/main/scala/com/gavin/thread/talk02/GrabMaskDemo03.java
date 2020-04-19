package com.gavin.thread.talk02;

/**
 * Created with IntelliJ IDEA.
 * Project:fausai_talk
 * Author: gavin
 * Date: 2020-04-19 15:46
 * Description: TODO
 */
public class GrabMaskDemo03 implements Runnable {
    private int masks = 100;

    public void run() {
        while (true) {
            synchronized (this) {
                if (masks > 0) {
                    try {
                        Thread.sleep(500);
                        String name = Thread.currentThread().getName();
                        System.out.println("恭喜" + name + "抢到第" + masks + "个口罩");
                        masks--;
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        GrabMaskDemo03 grabMaskDemo03 = new GrabMaskDemo03();
        Thread t1 = new Thread(grabMaskDemo03);
        Thread t2 = new Thread(grabMaskDemo03);
        Thread t3 = new Thread(grabMaskDemo03);
        t1.setName("张三");
        t2.setName("李四");
        t3.setName("王五");
        t1.start();
        t2.start();
        t3.start();
    }
}
