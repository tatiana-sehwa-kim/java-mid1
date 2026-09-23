package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2{    // 체크 예외라 throw 써주기
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {   // 예외 처리안하고 밖으로 떤질꺼야 라는뜻
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);

//            중간에 다른 예외가 발생했다고 가정        // NetworkServiceV2_4
//            throw new RuntimeException("ex");   // 언체크예외임 throws에 선언 안해도됨
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
