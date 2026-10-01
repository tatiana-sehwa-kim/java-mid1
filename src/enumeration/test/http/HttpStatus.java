package enumeration.test.http;

public enum HttpStatus {

    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    //메서드안에서 상태를 리턴해야함
    public static HttpStatus findByCode(int code) {

        for (HttpStatus status : values()) {            // values() 이넘 종류를 배열로 몽땅 쏟아내기
            if (code == status.getCode()) {
                return status;
            }
        }
        return null; // 왜??
    }

    public boolean isSuccess() {
        return ( code >= 200 && code <= 299 );
    }
}
