package enumeration.ref1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10);      // 생성할때 등급과 할인율
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    public ClassGrade(int discountPercent) {        // 생성자
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {       // get
        return discountPercent;
    }
}

