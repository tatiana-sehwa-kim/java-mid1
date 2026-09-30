package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class ClassGradeEX3_1 {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);           // Enum의 Grade.
        int gold = discountService.discount(GOLD, price);             // alt enter로 import 하고 코드를 줄일수 있다
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}

//    BASIC 등급의 할인 금액: 1000
//    GOLD 등급의 할인 금액: 2000
//    DIAMOND 등급의 할인 금액: 3000
