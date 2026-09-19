package lang.String.builder;

public class StringBuilderMain1_2 {

    static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4,"Java")
                        .delete(4, 8)
                                .reverse()
                                        .toString();        // 이렇게 줄여버릴수 있다.

        System.out.println("string = " + string);       // string = DCBA
    }
}
