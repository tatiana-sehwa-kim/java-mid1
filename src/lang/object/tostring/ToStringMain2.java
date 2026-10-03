package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {


        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(car));
        System.out.println("refValue = " + refValue);
        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue1 = " + refValue1);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue2 = " + refValue2);
    }
}

//    1. 단순 toString 호출
//    lang.object.tostring.Car@3f99bd52
//    Dog{dogName='멍멍이1', age=2}
//    Dog{dogName='멍멍이2', age=5}
//    2. println 내부에서 toString 호출
//    lang.object.tostring.Car@3f99bd52
//    Dog{dogName='멍멍이1', age=2}
//    Dog{dogName='멍멍이2', age=5}
//    3. Object 다형성 활용
//    객체 정보 출력: lang.object.tostring.Car@3f99bd52
//    객체 정보 출력: Dog{dogName='멍멍이1', age=2}
//    객체 정보 출력: Dog{dogName='멍멍이2', age=5}
//    refValue = 3f99bd52
//    refValue1 = 85ede7b
//    refValue2 = 85ede7b