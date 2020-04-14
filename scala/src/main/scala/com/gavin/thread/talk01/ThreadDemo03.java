package com.gavin.thread.talk01;

/**
 * Created with IntelliJ IDEA.
 * Project:fausai_talk
 * Author: gavin
 * Date: 2020-04-14 7:06
 * Description: TODO
 */
public class ThreadDemo03 extends Thread {

    public static void main(String[] args) {
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        threadDemo01.setName("thread01");
        ThreadDemo02 threadDemo02 = new ThreadDemo02();
        threadDemo02.setName("thread02");
        threadDemo01.start();
        threadDemo02.start();
    }
}