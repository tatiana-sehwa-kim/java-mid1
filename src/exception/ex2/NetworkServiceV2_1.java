package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {

        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}

// 남은 문제
// 예외 처리를 도입했지만, 아직 예외가 복구되지 않는다. 따라서 예외가 발생하면 프로그램이 종료된다.
// 사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제해야 한다.
