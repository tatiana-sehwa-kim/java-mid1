package lang.String.method;

public class StringUtilsMain2 {
    static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);   // 그자리에 대입하는느낌
        System.out.println("format1 = " + format1);         // format1 = num: 100, bool: true, str: Hello, Java!

        //format이 하는 다른것 더
        String format2 = String.format("숫자: %.2f", 10.1234);    //소수 둘째자리
        System.out.println("format2 = " + format2);         // format2 = 숫자: 10.12

        //printf
        System.out.printf("숫자: %.2f\n" , 10.1234);          // 숫자: 10.12

        //matches 메서드
        //"Hello, Java!";
        String regex = "Hello, (Java!|World)";      // 둘중하나 들어오면 매칭이 된다. 이건 정규표현식이고 알아두기만
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));      // 'str'이 패턴과 일치하는가? true
    }
}
