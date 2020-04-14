package com.gavin.thread.talk01;
/**
 * Created with IntelliJ IDEA.
 * Project:fausai_talk
 * Author: gavin
 * Date: 2020-04-14 7:06
 * Description: TODO
 */
public class RunnableDemo03 {
    public static void main(String[] args) {
        Thread t1 =new Thread(new RunnableDemo01());
        t1.setName("t1");
        Thread t2 =new Thread(new RunnableDemo02());
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
