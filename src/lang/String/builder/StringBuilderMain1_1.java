package lang.String.builder;

public class StringBuilderMain1_1 {

    static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("A");         // append- 뒤에다가 계속 더하는것.
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);   // sb = ABCD

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);   // insert = ABCDJava

        sb.delete(4, 8);
        System.out.println("delete = " + sb);   // delete = ABCD

        sb.reverse();
        System.out.println("reverse = " + sb);   // reverse = DCBA

        //StringBuilder -> String
        String string = sb.toString();  // 가변 String 을 고정된 String으로 생성하여 반환한다. "고정"
        System.out.println("string = " + string);       // string = DCBA
    }
}
