package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();        // 연월일

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);      // 넌그럼 크로노필드 저걸 쓸수있니? 라고 묻는것
        System.out.println("supported = " + supported);     // false

        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);     // 만약에 지원하면 이거 실행해~ 란뜻
            System.out.println("minute = " + minute);
        }
    }
}
