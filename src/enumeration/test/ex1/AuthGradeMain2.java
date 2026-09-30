package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: ");
        String input = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(input.toUpperCase());   //  valueOf()가 엉뚱한 글자 들어오면 터트려라 라는 뜻 예외처리

        System.out.println("당신의 등급은 " + authGrade.getDescription() + " 입니다.");
        System.out.println("==메뉴 목록==");

        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }
}
