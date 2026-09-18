package lang.String.method;

public class StringComparisonMain {
    static void main(String[] args) {

        String str1 = "Hello, Java!";   // 대문자 일부 있음
        String str2 = "hello, java!";   // 대문자없고 소문자만
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // 대소문자 무시하고 같은지

        System.out.println("'a' compareTo 'b': " + "a".compareTo("b"));     // 출력: -1
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));     // 출력: 1
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));     // 출력: 2. 몇칸 차이나냐. 그거임

        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));     // 출력 -13
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));     // 출력 0

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));

    }
}
