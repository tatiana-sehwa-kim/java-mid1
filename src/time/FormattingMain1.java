package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);

        //포맷팅: 날짜를 문자로
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");     // 포맷을 정하고
        String formattedDate = date.format(formatter);                                  // 포맷 적용
        System.out.println("formattedDate = " + formattedDate);

        //파싱: 문자를 날짜로
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);               // input을 위의 formatter 형태로 뽑아내겠다.
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDate);
    }
}

//    date = 2024-12-31
//    formattedDate = 2024년 12월 31일
//    문자열 파싱 날짜와 시간 = 2030-01-01