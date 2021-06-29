package com.company.thread;

public class Printer {

    public synchronized void print(String str){
        for (char c: str.toCharArray()) {
            System.out.print(c); //한글자씩 출력
            try {
                Thread.sleep(1000); //스레드 간섭을 보기 위해 sleep을 둠
            } catch (InterruptedException e){}
        }
        System.out.println('\n');
    }
}
