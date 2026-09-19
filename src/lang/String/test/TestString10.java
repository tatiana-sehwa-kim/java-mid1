package lang.String.test;

public class TestString10 {
    public static void main(String[] args) {

        // split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라

        String fruits = "apple,banana,mango";

        String[] fruitslist = fruits.split(",");
        for (String s : fruitslist) {
            System.out.println(s);
        }

        String joined = String.join("->", fruitslist);
        System.out.println("result = " + joined);
    }
}

