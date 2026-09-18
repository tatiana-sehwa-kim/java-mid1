package lang.String.equals;

public class StringEqualsMain2 {
    static void main(String[] args) {       // 문자열 비교시 항상 .equals()를 써야하는 이유

        String str1 = new String("hello");  // x001             // 개발자 A
        String str2 = new String("hello");  // x002
        System.out.println("메서드 호출 비교1: " + isSame(str1,str2));

        String str3 = "hello";  //x003
        String str4 = "hello";  //x003
        System.out.println("메서드 호출 비교2: " + isSame(str3,str4));
    }

    private static boolean isSame(String x, String y) {                 // 개발자 B
//        return x == y;
        return x.equals(y);
    }
}

// 개발자가 분리되어있다고 가정하고, 개발자A는 Main을 개발하고, 개발자B는 문자열 비교를 개발한다고 가정하면
// 개발자 B 는 new로 생성한 hello 가 들어올지, 아니면 문자열 풀의 hello 가 들어올지 모르기 때문에 항상 .equals()를 써야한다.

