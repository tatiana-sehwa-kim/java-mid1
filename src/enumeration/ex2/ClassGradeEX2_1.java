package enumeration.ex2;

public class ClassGradeEX2_1 {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}

//    단점
//    이 패턴을 구현하려면 다음과 같이 많은 코드를 작성해야 한다. 그리고 private 생성자를 추가하는 등 유의해야 하는 부분들도 있다
//    그래서 나온것이 Enum Type
