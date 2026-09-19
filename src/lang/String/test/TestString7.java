package lang.String.test;

public class TestString7 {
    public static void main(String[] args) {

        String original = "    Hello Java   ";      // 문자의 양쪽 공백을 제거해라
        String trimmed = original.strip();
        System.out.println(trimmed);

    }
}
