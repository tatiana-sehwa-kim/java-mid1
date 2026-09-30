package enumeration.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);           // 필요 없는 클래스가됨
    }
}
