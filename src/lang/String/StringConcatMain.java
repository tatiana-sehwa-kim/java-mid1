package lang.String;

public class StringConcatMain {
    static void main(String[] args) {
        String a = "hello";
        String b = " Java";

        String result1 = a.concat(b);   // concat- a 에다가 b를 더해라
        String result2 = a + b;         // 특별히 편의상 + 연산을 허용한다. String 만

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
