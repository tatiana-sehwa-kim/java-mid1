package exception.ex2;

public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;       // 예외도 객체기 때문에 아래꺼 다 만들수 있다.

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
