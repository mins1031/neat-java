package com.company.thread;

public class TimerThread {

    public static void main(String [] args){
        new Thread(new TimerThread()::doSomething).start();
    }

    public void doSomething(){
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
        }
    }
}
