package lang.String;

public class StringBasicMain {
    static void main(String[] args) {

        String str1 = "hello";   // 1. 대문자로 시작하는 String -> 객체. 참조다. 객체를 생성하는 것과 같다.
        String str2 = new String("hello");  // 2. 그래서 이렇게 생성할수 있다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}