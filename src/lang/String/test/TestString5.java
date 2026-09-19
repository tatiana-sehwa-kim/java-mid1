package lang.String.test;

public class TestString5 {
    public static void main(String[] args) {

        // str 에는 파일의 이름과 확장자가 주어진다. ext 에는 파일의 확장자가 주어진다. 파일명과 확장자를 분리해서 출력하라.

        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);    // 몇번재 칸이냐. 이걸 설정하는이유는 문자열이 변해도 사용할수있게
        str.substring(0, extIndex);

        String filename = str.substring(0,extIndex);
        String extName = str.substring(extIndex);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);

    }
}
