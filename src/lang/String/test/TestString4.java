package lang.String.test;

public class TestString4 {
    public static void main(String[] args) {

        // substring() 을 사용해서, hello 부분과 .txt 부분을 분리해라.

        String str = "hello.txt";

        String filename = str.substring(0,5);
        String extname = str.substring(5,9);

        System.out.println("filename = " + filename);
        System.out.println("extname = " + extname);
    }
}
