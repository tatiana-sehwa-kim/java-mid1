package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();      // 변하는 부분을 외부에서 전달받는것 : 인스턴스(process) 를 던지고 그 인스턴스의 메서드(process.run();)을 호출하는것
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }


    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i= " + i);
            }
        }
    }


    public static void main(String[] args) {
        Dice dice = new Dice();
        hello(dice);
        Sum sum = new Sum();
        hello(sum);
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

//    정리
//    문자열 같은 데이터를 메서드에 전달할 때는 String , int 와 같은 각 데이터에 맞는 타입을 전달하면 된다.
//    코드 조각을 메서드에 전달할 때는 인스턴스를 전달하고 해당 인스턴스에 있는 메서드를 호출하면 된다.
