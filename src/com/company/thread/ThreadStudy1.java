package com.company.thread;

import java.util.concurrent.TransferQueue;

public class ThreadStudy1 {
    public static void main(String [] args){

        Thread t = new SomeThread();
        t.start();

        Runnable r = new SomeRunnable();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
