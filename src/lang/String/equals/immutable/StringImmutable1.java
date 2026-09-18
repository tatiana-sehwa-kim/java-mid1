package lang.String.equals.immutable;

public class StringImmutable1 {

    static void main(String[] args) {

        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);     // 전혀 합쳐지지 않는다. str = hello 출력됨.
    }
}
