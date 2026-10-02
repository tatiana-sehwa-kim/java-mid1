package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {

        // 남은 기간과 디데이를 구해라

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        // 남은 기간
        Period between = Period.between(startDate, endDate);

        // 디데이
        long dDay = ChronoUnit.DAYS.between(startDate, endDate);


        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "개월 " + between.getDays() + "일");
        System.out.println("디데이: " + dDay + "일 남음");

    }
}

//    시작 날짜: 2024-01-01
//    목표 날짜: 2024-11-21
//    남은 기간: 0년 10개월 20일
//    디데이: 325일 남음