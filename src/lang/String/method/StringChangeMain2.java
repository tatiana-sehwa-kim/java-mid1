package lang.String.method;

import java.util.Locale;

public class StringChangeMain2 {
    static void main(String[] args) {

        String strWithSpaces = "     Java Programming ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());      //소문자로 변환:      java programming
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());      //대문자로 변환:      JAVA PROGRAMMING

        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");      // 공백 제거(trim): 'Java Programming'      trim 은 문자열 양쪽 끝의 공백을 제거한다. 단순 스페이스바(Whitespace)만 제거가능
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");     // 공백 제거(strip): 'Java Programming'    trim 기능에다가 유니코드 스페이스까지 제거한다. 좀 더 낫다.
        System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'");   // 앞 공백 제거(strip): 'Java Programming '
        System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'");  // 뒤 공백 제거(strip): '     Java Programming'
    }
}
