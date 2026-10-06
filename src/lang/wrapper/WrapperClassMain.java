package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        Integer newInteger = new Integer(10);   // 미래 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10);   // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);   // toString 다 오버라이딩 하고있다는 것
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();   // 값 꺼내기: 언박싱
        System.out.println("intValue = " + intValue);   // 10
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));    // false
        System.out.println("equals: " + (newInteger.equals(integerObj)));    // true
    }
}
