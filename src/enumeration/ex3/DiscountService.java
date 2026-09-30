package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade classGrade, int price) {      // Enum의 Grade로
        int discountPercent = 0;

        if (classGrade == BASIC) {      // alt enter 하면 import 되면서 코드를 줄일수 있다
            discountPercent = 10;
        } else if (classGrade == GOLD) {
            discountPercent = 20;
        } else if (classGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        // 10000 * 20
        return price * discountPercent / 100;
    }
}
