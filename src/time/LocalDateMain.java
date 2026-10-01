package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();        // 오늘 날짜
        LocalDate ofDate = LocalDate.of(2016, 12, 8);       // 지정 날짜

        System.out.println("오늘 날짜= " + nowDate);
        System.out.println("지정 날짜= " + ofDate);

        // 오늘 날짜= 2026-10-01
        // 지정 날짜= 2016-12-08

        //계산 (불변) 이기 때문에 ofDatd에 반환값을 받는다
        ofDate = ofDate.plusDays(10);       // 날짜 계산
        System.out.println("지정 날짜+10d = " + ofDate);

        // 지정 날짜+10d = 2016-12-18

    }
}
