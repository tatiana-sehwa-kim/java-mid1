package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);

        // 오타
        int DIAMONDD = discountService.discount("DIAMONDD", price);

        // 소문자
        int gold = discountService.discount("gold", price);

        System.out.println("VIP 등급의 할인 금액: " + vip);
        System.out.println("DIAMONDD 등급의 할인 금액 " + DIAMONDD);
        System.out.println("gold 등급의 할인 금액 " + gold);
    }
}

//    VIP: 할인X
//    DIAMONDD: 할인X
//    gold: 할인X
//    VIP 등급의 할인 금액: 0
//    DIAMONDD 등급의 할인 금액 0
//    gold 등급의 할인 금액 0

//    String 사용 시 타입 안정성 부족 문제