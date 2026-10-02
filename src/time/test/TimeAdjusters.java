package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TimeAdjusters {
    public static void main(String[] args) {

        // 입력 받은 월의 첫날 요일과 마지막날 요일을 구해라.

        int year = 2024;
        int month = 1;

        // 코드 작성

        LocalDate firstDate = LocalDate.of(year,month,1);                   // 첫날 객체
        LocalDate lastDate = firstDate.with(TemporalAdjusters.lastDayOfMonth());        // 이 달의 마지막 날로 바꿔줘

        DayOfWeek firstDayOfWeek = firstDate.getDayOfWeek();
        DayOfWeek lastDayOfweek = lastDate.getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfweek = " + lastDayOfweek);


    }
}
