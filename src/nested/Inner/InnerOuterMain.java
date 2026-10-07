package nested.Inner;

public class InnerOuterMain {
    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();     // 단독생성불가. 바깥클래스가 반드시 있어야 그 안에만 생성가능

        inner.print();
        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
