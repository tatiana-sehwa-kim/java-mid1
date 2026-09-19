package lang.String.chaining;

public class MethodChainingMain2 {
    static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);       // 자기자신의 참조값을 반환해 또 참조
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();

        System.out.println("result = " + adder);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);
    }
}
