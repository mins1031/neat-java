package com.company.lamda;

public class GreetingEx {

    public void sayHello(Greeting greeting){
        greeting.greet();
    }

    public void go(){
        // 1. 영어 인사 클래스
        class EnglishGreeting implements Greeting{
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        }
        Greeting englishGreeting = new EnglishGreeting();
        sayHello(englishGreeting);
        //위를 보면 구지 Hello라는 문자열 출력하는 동작을 동작시키기 위해 인터페이스 생성해 동작시키는
        //방식은 너무 번거롭다.

        // 2. 프랑스 인사는 익명 클래스로 구현
        Greeting frenchGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Bonjour");
            }
        };
        sayHello(frenchGreeting);

        //3. 스페인어 인사는 익명클래스를 메서드에 직접 삽입
        sayHello(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hola");
            }
        });

        //4. 한국어 인사는 람다식 사용
        //람다식은 funtional 인터페이스 구현체의 메서드 내부
        Greeting koreanGreetin = () -> {
            System.out.println("안녕");
        };
        sayHello(koreanGreetin);
        //위의 내용은 밑처럼 줄일수 있다.

        sayHello( () -> {
            System.out.println("안녕");
        });
        /**
         * funtional 인터페이스를 보면  인터페이스 이름과 내부의 메서드 이름은 중요하지않고 해당 인터페이스의
         * 구현체가 중요한 것이기 떄문에 인자값과 메서드 내부만을 표기해 코드를 간결하게 하였다
         * */
    }

    public static void main(String[] args){
        new GreetingEx().go();
    }
}
