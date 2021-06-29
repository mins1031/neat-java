package com.company.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerEx {
    public static void main(String[] args){
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable beeper = () -> System.out.println("beep");

        //scheduleAtFixedRate(태스크, 처음 실행 딜레이, 간격, 딜레이,간격에 대한 단위)
        // beeper 태스크를 1초후 부터 1초 단위로 실행
        // 일정간격 규칙적으로 어떤것을 하고 싶을때 사용할수 있다. 스레드의 실행을 체계적으로 적용가능.
        scheduler.scheduleAtFixedRate(beeper, 1,1, TimeUnit.SECONDS);
    }
}
