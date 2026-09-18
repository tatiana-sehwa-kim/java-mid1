package lang.String.method;

public class StringUtilsMain1 {
    static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        Object obj = new Object();      // 객체.
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);  // 숫자뿐이 아니라 불리안도 다들어온다. 숫자의 문자열 값: 100
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);    //불리언의 문자열 값: true
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);      //객체의 문자열 값: java.lang.Object@f6f4d33

        //문자 + x -> 문자 로 변해버림
        String numString2 = "" + num;   // num이 문자로 바껴버림
        System.out.println("빈문자열 + num: " + numString2);        //빈문자열 + num: 100

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();    // 바이트배열로 들어간 string 을 char 배열로 꺼내주는것
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);  // 뭐랑 +를 해버리면 참조값이 나옴   // 문자열을 문자 배열로 변환: [C@23fc625e
        System.out.println(strCharArray);   // 그냥 인쇄하면 Hello, Java! 가 나옴                         // Hello, Java!

        for (char c : strCharArray) {
            System.out.print(c);                //Hello, Java!
        }
        System.out.println();
    }
}
