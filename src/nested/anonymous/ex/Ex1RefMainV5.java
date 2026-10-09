package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        System.out.println("Hello 실행");

        // 이것이 바로 람다
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        });
        
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i= " + i);
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

