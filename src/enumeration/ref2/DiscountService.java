package enumeration.ref2;

public class DiscountService {

    public int discount(Grade grade, int price) {      // Enum의 Grade로
        return price * grade.getDiscountPercent() / 100;
    }
}
