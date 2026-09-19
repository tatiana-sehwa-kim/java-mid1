package lang.String.test;

public class TestString11 {
    public static void main(String[] args) {

        // str 문자열을 반대로 뒤집어라. StringBuilder 에 있는 reverse() 를 사용해라.

        String str = "Hello Java";

        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);

    }
}

