package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmatableAddress a = new ImmatableAddress("서울");
        ImmatableAddress b = a;     // 참조값 대입을 막을수있는 방법은 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산");   // b의 값을 부산으로 변경해야함
        b = new ImmatableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//    a = Address{value='서울'}
//    b = Address{value='서울'}
//    부산 -> b
//    a = Address{value='서울'}
//    b = Address{value='부산'}


