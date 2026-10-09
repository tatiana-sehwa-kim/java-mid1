package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();      // 변하는 부분을 외부에서 전달받는것 : 인스턴스(process) 를 던지고 그 인스턴스의 메서드(process.run();)을 호출하는것
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        System.out.println("Hello 실행");

        hello(new Process() {      // 익명 클래스
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        });

        hello(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i= " + i);
                }
            }
        });
    }
}

//    프로그램 시작
//    randomValue = 1
//    프로그램 종료
//    프로그램 시작
//    i= 0
//    i= 1
//    i= 2
//    프로그램 종료

