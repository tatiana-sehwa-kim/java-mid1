package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {     // 정상 흐름

            client.connect();
            client.send(data);  // throw new RuntimeException("ex"); 런타임 오류났을때 아래서 캐치를 못함 catch를 또만들면 모를까 -> client.disconnect() 호출안됨.

        } catch (NetworkClientExceptionV2 e) {          // 예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        client.disconnect();
    }
}

//   전송할 문자: hello
//  http://example.com 서버 연결 성공
//  http://example.com 서버에 데이터 전송: hello
//  http://example.com 서버 연결 해제
//
//  전송할 문자: error1
//  [오류] 코드: connectError, 메시지: http://example.com 서버 연결 실패
//  http://example.com 서버 연결 해제
//
//  전송할 문자: error2
//  http://example.com 서버 연결 성공
//  [오류] 코드: sendError, 메시지: http://example.com 서버에 데이터 전송 실패: error2
//  http://example.com 서버 연결 해제
//
//  전송할 문자: exit
//  프로그램을 정상 종료합니다.

// disconnect를 catch 밑에 적으면 해결되는것 같아 보인다. 하지만 바로 catch 에서 잡을 수 없는 예외가 발생할 때 큰일남.
// NetworkClientV2 가서 sendError 런타임익셉션(언체크에러) 실행했을때