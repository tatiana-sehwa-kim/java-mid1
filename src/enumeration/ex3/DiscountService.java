package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {      // Enum의 Grade로
        int discountPercent = 0;

        if (grade == BASIC) {      // alt enter 하면 import 되면서 코드를 줄일수 있다
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        } else if (grade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        // 10000 * 20
        return price * discountPercent / 100;
    }
}
