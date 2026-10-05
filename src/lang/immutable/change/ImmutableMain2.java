package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {

        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj add = obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());    // 10
        System.out.println("add = " + add); // 반드시 반환값을 받아서 출력

    }
}
