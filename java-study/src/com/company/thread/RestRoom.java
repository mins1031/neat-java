package com.company.thread;

public class RestRoom {

    public void use() {
        synchronized (this) {
            System.out.format("%s : 화장실에 들어갔다.\n", Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.format("%s: 화잘실에서 나왔다.\n", Thread.currentThread().getName());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.format("%s: 손을 씻었다.\n", Thread.currentThread().getName());
    }
}
