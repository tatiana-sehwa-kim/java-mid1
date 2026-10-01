package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);         // 불변일때 with를 써서 뭔가 새로운걸 만들때 쓴다. 년도를 바꿨다
        System.out.println("changedDt1 = " + changedDt1);                           // 특정필드 하나만 딱 바꾼다 할때 with

        LocalDateTime changedDt2 = dt.withYear(2020);             // 편의메서드가 낫다
        System.out.println("changedDt2 = " + changedDt2);

        //TemporalAdjuster 사용
        //다음주 금요일 같이 복잡한
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dt);
        System.out.println("다음 금요일: " + with1);

        //이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일: " + with2);

    }
}

//    dt = 2018-01-01T13:30:59
//    changedDt1 = 2020-01-01T13:30:59
//    changedDt2 = 2020-01-01T13:30:59
//    기준 날짜: 2018-01-01T13:30:59
//    다음 금요일: 2018-01-05T13:30:59
//    같은 달의 마지막 일요일: 2018-01-28T13:30:59