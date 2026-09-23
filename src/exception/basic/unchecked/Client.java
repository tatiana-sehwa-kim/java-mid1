package exception.basic.unchecked;

// 언체크 예외를 터트리는 말썽꾸러기 킄래스 = 폭탄을 직접 발생시키는곳이 여기

public class Client {

    public void call() {    //  원래대로면 throws 써야하는데 언체크드는 안써도됨. 체크드는 써야함. 둘의 유일한 차이
        throw new MyUncheckedException("ex");   // 여기에 들어갈 말은 보통 "잘못된 입력입니다/ 0은 입력할 수 없습니다"같은 안내문구 넣는 자리. "이 사고는 'ex' 때문에 터졌습니다" 알려주기
    }
}

// throw 는 "이 찍어낸 폭탄을 위로 던져라!"라는 뜻

//  public void validate(int number) {
//     if (number < 0) {     // 검사할 조건
//         throw new IllegalArgumentException("숫자는 0 이상이어야 합니다.");      // 우테코 과제에서 쓰는 코드가 이런식!
//     }
//  }