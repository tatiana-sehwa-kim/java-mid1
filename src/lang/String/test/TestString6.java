package lang.String.test;

public class TestString6 {
    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";       // str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라. indexOf() 를 반복문과 함께 풀면 된다.
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while (index >= 0) {                                            // 더 이상 hello가 없을때 -1 반환
            index = str.indexOf(key, index + 1);
            System.out.println("index in while = " + index);
            count ++;
        }

        System.out.println("count = " + count);
    }
}