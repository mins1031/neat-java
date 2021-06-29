package com.company.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
    public static void main(String[] args){
        RestRoom restRoom = new RestRoom();

        Runnable r = () -> restRoom.use();
        //워크 스레드 2개의 풀 생성
        ExecutorService service = Executors.newFixedThreadPool(2);
        //스레드 4개가 돌려야 할것 같지만 2개가 번갈아서 돌려줌.
        service.execute(r);
        service.execute(r);
        service.execute(r);
        service.execute(r);

        //ExecutorService는 shutdown()해주지 않으면 스레드 풀은 계속 돌고 있다.
        service.shutdown();
    }
}
