package com.company.thread;

public class SharedPrinterEx {
    public static void main(String[] args){
        Printer printer = new Printer();

        new Thread(() -> printer.print("ABCDE")).start();
        new Thread(() -> printer.print("abcde")).start();
        /**
         * 위의 두 스레드는 밑처럼 하나의 명령이 끝나고 다음 동작이 실행되는것이 아니다
         * printer.print("ABCDE");
         * printer.print("abcde");
         * 첫 스레드 start()후 바로 밑의 스레드가 실행되는 것이기 때문에 서로 독립적으로 동시에 동작하고 있는것이다.
         * 다만 여기서 문제는'printer라는 공유자원을 둘이 동시에 사용한다는것'
         * printer의 print메서드에 synchronized라고 명시해주면 동기화 처리를 한다.
         * 해서 위의 처음 스레드가 먼저 키를 쥐고 걸어잠궜기에 밑의 스레드는 동작할수 없고 처음 스레드가 끝난후
         * 밑의 스레드가 사용하게 된다.
         * */
    }
}
