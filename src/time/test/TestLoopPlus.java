package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {

        // 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.

        LocalDate startDate = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(( i * 2 ), ChronoUnit.WEEKS);
            System.out.println("날짜 " + ( i + 1 ) + ": " + nextDate);
        }
    }
}

//    날짜 1: 2024-01-01
//    날짜 2: 2024-01-15
//    날짜 3: 2024-01-29
//    날짜 4: 2024-02-12
//    날짜 5: 2024-02-26
