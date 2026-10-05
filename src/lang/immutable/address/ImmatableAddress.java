package lang.immutable.address;

public class ImmatableAddress {     // 불변 객체

    private final String value;

    public ImmatableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
