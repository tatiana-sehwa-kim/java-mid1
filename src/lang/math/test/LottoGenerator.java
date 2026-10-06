package lang.math.test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoGenerator {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> lottoGenerator = new HashSet<>();
        System.out.print("로또 번호: ");

        while (lottoGenerator.size() < 6) {
            int number = random.nextInt(45) + 1;
            lottoGenerator.add(number);
        }

        for (int number : lottoGenerator) {
            System.out.print(number + " ");
        }
    }
}

//    1. 변수명은 소문자로 시작하기 (카멜 케이스)
//    2. 왼쪽의 타입을 HashSet 대신 상위 인터페이스인 Set으로 선언하는 습관을 들이는 것이 좋다. 나중에 다른 Set으로 바꾸고 싶을때 오른쪽만 바꾸면 되게
//    3. 단순 출력용이라면 Integer가 아니라 int