package nested.anonymous;

import nested.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;


        Printer printer = new Printer() {      // 선언하고 생성하는걸 합쳐서 -> 생성하면서 바로 구현

            int value = 0;

            public void print() {
                System.out.println("value=" + value);
                System.out.println("LocalVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
}
