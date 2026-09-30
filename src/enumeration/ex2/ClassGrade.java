package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();    // 각각 상수를 선언하기 위해 static,final
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private 생성자를 추가함으로써 타입 안전 열거형 패턴 완성
    private ClassGrade() {}
}

