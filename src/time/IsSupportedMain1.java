package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {     // 이 필드 쓸수있어? 란뜻

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();        // 연월일
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);     //초 -> 지원하지 않는 필드(오류뜸)
        System.out.println("minute = " + minute);
    }
}
