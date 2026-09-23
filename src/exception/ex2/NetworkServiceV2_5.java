package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {     // 정상 흐름
            client.connect();
            client.send(data);          // throw new RuntimeException("ex"); 해결할수 없는 오류 떴는데 못나감. finally 때문에
        } catch (NetworkClientExceptionV2 e) {          // 예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();        // finally { 앞에서 오류가 터지건 안터지건 마지막에 무조건 실행되어야 하는부분 }
        }
    }
}

//      catch 없이 try ~ finally 만 사용할 수도 있다.
//
//      try {
//           client.connect();
//           client.send(data);
//      } finally {
//           client.disconnect();
//           }
//
//      예외를 직접 잡아서 처리할 일이 없다면 이렇게 사용하면 된다. 이렇게 하면 예외를 밖으로 던지는 경우에도 finally 호출이 보장된다.

//      정리
//      자바 예외 처리는 try ~ catch ~ finally 구조를 사용해서 처리할 수 있다. 덕분에 다음과 같은 이점이 있다.
//      정상 흐름과 예외 흐름을 분리해서, 코드를 읽기 쉽게 만든다.
//      사용한 자원을 항상 반환할 수 있도록 보장해준다.