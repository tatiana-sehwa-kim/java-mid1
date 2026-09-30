package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + ClassGrade.BASIC);  // 셋다 참조값
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);

    }
}

//    class BASIC = class enumeration.ex2.ClassGrade
//    class GOLD = class enumeration.ex2.ClassGrade
//    class DIAMOND = class enumeration.ex2.ClassGrade
//    ref BASIC = enumeration.ex2.ClassGrade@23fc625e
//    ref GOLD = enumeration.ex2.ClassGrade@3f99bd52
//    ref DIAMOND = enumeration.ex2.ClassGrade@4f023edb