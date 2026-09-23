package exception.basic.unchecked;

// RuntimeException 을 상속받은 예외는 언체크 예외가 된다.

public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}


    //4개 클래스의 역할 분담

    //  MyUncheckedException (사고 유형 / 폭탄 그 자체)
    //  역할: "터질 폭탄의 종류"입니다.
    //  어떤 문제가 터졌는지 이름을 붙여두기 위해 클래스로 정의한 것입니다.

    //  Client (말단 작업자 / 사고를 일으킨 주체)
    //  역할: 실제 현장에서 작업을 하다가 사고를 치는 말단 직원입니다.
    //  throw new MyUncheckedException("ex")로 폭탄을 직접 발생시키는 곳입니다.

    //  Service (중간 관리자 / 사고를 수습하거나 넘기는 자)
    //  역할: 말단 직원(Client)을 데리고 일하는 팀장입니다.
    //  말단 직원이 친 사고를 보고 "내가 여기서 직접 수습할 것인가(callCatch) vs 위에 사장님한테 보고할 것인가(callThrow)"를 결정하는 곳입니다.

    //  UncheckedCatchMain (사장님 / 프로그램의 시작과 끝)
    //  역할: 전체 프로그램을 실행하는 총괄 관제탑(main)입니다.
    //  팀장(Service)에게 일을 시키고, 사고가 수습되어 프로그램이 정상 종료되는지 최종 결과를 지켜보는 자리입니다.