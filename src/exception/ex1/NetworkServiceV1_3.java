package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();        // 정상 흐름 1
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);        // 정상 흐름 2
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);             }
        }
        client.disconnect();                            // 정상 흐름 3 // 나머지 전부 예외흐름. 너무많고 섞여있다. => 예외처리가 필요한이유
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");                   // not equals
    }

}
