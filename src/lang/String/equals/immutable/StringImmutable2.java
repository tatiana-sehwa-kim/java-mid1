package lang.String.equals.immutable;

public class StringImmutable2 {

    static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);     // String 은 불변 객체이기 때문에 기존값을 변경하지 않고 대신에 새로운 결과를 만든다.
        System.out.println("str2 = " + str2);
    }
}
