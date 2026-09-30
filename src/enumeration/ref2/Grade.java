package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);       // 생성자를 통해 가능하게됨. 등급(할인율)

    private final int discountPercent;

    private Grade(int discountPercent) {    // 생성자는 리턴 ㄴㄴ void도 쓰면안됨
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
