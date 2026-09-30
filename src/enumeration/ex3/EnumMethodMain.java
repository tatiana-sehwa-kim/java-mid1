package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));      // values = [BASIC, GOLD, DIAMOND]  배열 내부의 값을 출력할 때 사용
        for (Grade value : values) {
            System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal());    // .name() 이름 반환 / .ordinal() 숫자를 부여하는것
        }
//            name=BASIC, ordinal=0
//            name=GOLD, ordinal=1
//            name=DIAMOND, ordinal=2

        //String -> Enum 변환, input에 잘못된 문자 넣으면 IllegalArgumentException
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);   // toString 오버라이딩 가능

//            "외부에서 글자(String)로 들어온 위험한 데이터를, 우리 시스템이 허용한 딱 정해진 안전한 Enum 객체로 바꿔서 문을 통과시키자!"
//            할 때 쓰는 검문소 도구가 바로 valueOf()


    }
}

//    자바 Enum의 4대 기본 내장 메서드
//    values()      "너 안에 든 목록 전부 배열로 줘봐" → Grade[] values = Grade.values();
//    name()        "너 이름이 글자로 뭐야?" → value.name() (결과: "BASIC", "GOLD")
//    ordinal()     "너 몇 번째로 정의된 녀석이야?" (0부터 시작하는 순번) → value.ordinal() (결과: 0, 1, 2)
//    valueOf(String) "글자 줄 테니까 거기에 맞는 Enum 객체 찾아줘" → Grade.valueOf("GOLD")
