package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {

        String str = "100";

        Integer integer1 = Integer.valueOf(str);    // string -> Integer
        int intValue = integer1.intValue();         // Integer -> int
        Integer integer2 = Integer.valueOf(intValue);   // int -> Integer

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
