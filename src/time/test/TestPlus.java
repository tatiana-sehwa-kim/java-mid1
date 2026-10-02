package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {

        // 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라.

        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 00, 00);   // 지정 날짜시간
        System.out.println("기준 시각: " + dateTime);

        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);        // 체인메서드닝 가능
        System.out.println("1년 2개월 3일 4시간 후의 시각 " + futureDateTime);
    }
}

//    기준 시각: 2024-01-01T00:00
//    1년 2개월 3일 4시간 후의 시각 2025-03-04T04:00
