package com.gavin.thread.talk01;

/**
 * Created with IntelliJ IDEA.
 * Project:fausai_talk
 * Author: gavin
 * Date: 2020-04-14 7:06
 * Description: TODO
 */
public class RunnableDemo02 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println(Thread.currentThread().getName() + ": " + i + " is running");
    }
}
