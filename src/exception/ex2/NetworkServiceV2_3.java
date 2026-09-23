package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {     // 정상 흐름 분리                   // 아예 다 합쳐버림. 하나의 try 안에 정상 흐름을 다 담는것. 그리고 예외 부분은 catch 블럭에서 해결한다.
                                                    // 이렇게 하면 정상 흐름은 try 블럭에 들어가고, 예외 흐름은 catch 블럭으로 명확하게 분리할 수 있다.
            client.connect();       // connect 에서 에러 발생시 catch로 내려간다음 예외처리 하고 return 해서 나가면 다시 while문의 반복
            client.send(data);      // send 에러 발생시 catch로 내려간다음 다시시작
            client.disconnect();

        } catch (NetworkClientExceptionV2 e) {          // 예외 흐름 분리
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }                                            // return은 지운다. catch 블록 뒤에 더 이상 실행할 코드가 남아있지 않아서 return을 쓸 이유가 사라짐
    }
}

//  해결된 문제
//  자바의 예외 처리 메커니즘과 try , catch 구조 덕분에 정상 흐름은 try 블럭에 모아서 처리하고, 예외 흐름 은 catch 블럭에 별도로 모아서 처리할 수 있었다.
//  덕분에 정상 흐름과 예외 흐름을 명확하게 분리해서 코드를 더 쉽게 읽을 수 있게 되었다.

//  남은 문제
//  사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제해야 한다.