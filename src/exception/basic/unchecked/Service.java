package exception.basic.unchecked;

// UnChecked 예외는 예외를 잡거나, 던지지 않아도 된다.
// 예외를 잡지 않으면 자동으로 밖으로 던진다.

public class Service {

    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리할 수 있다.
    public void callCatch() {

        try {
            client.call();
        } catch (MyUncheckedException exception) {      // catch 뒤에 클래스 이름을 적는이유: "내가 어떤 종류의 사고를 전담해서 처리할 것인지"를 자바에게 정확히 알려주기 위해서
            //예외 처리 로직
            System.out.println("예외 처리, message= " + exception.getMessage());       // 이렇게 예외를 잡았으니까 정상로직이 되어 아래로
        }
        System.out.println("정상 로직");

    }

    // 예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다.
    // 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
    public void callThrow() {
        client.call();
    }
}
    //  service.callThrow()에는 try-catch가 없습니다.
    //  "난 안 잡을래!" 하고 폭탄을 자기를 부른 main으로 그냥 패스(Throw)해버립니다.
