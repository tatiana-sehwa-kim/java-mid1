package time;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2030, 1, 2, 13, 30, 59);
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));       // 시간필드의 년을 조회하겠다
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));           // 1년 중에 몇달인가?
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));             // 1달 중에 며칠인가?
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY));              // 하루 중에 몇시간인가?
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));         // 한시간 중에 몇분인가?
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE));         // 1분 중에 몇초인가?


        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = " + dt.getYear());
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue());               // getMonth는 January 반환, ★ Value 붙어야 1 반환
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = " + dt.getHour());
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute());
        System.out.println("SECOND_OF_MINUTE = " + dt.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));         // 13시 30분은 총 몇분이냐
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));         // 13시 30분 59초는 총 몇초냐
    }
}

//    YEAR = 2030
//    MONTH OF YEAR = 1
//    DAY OF MONTH = 2
//    HOUR OF DAY = 13
//    MINUTE OF HOUR = 30
//    SECOND OF MINUTE = 59

//    편의 메서드 제공
//    YEAR = 2030
//    MONTH OF YEAR = 1
//    DAY OF MONTH = 2
//    HOUR OF DAY = 13
//    MINUTE OF HOUR = 30
//    SECOND OF MINUTE = 59

//    편의 메서드에 없음
//    MINUTE_OF_DAY = 810
//    SECOND_OF_DAY = 48659