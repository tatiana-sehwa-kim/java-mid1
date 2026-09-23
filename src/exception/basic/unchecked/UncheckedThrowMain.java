package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {

        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}

// 오류가 뜨며 프로그램이 터지는 것 자체가 이 코드의 목적