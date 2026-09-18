package lang.String.equals;

public class StringEqualsMain1 {
    static void main(String[] args) {

        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002
        System.out.println("new String() == 비교: " + (str1 == str2));            // 같은 주소값을 가리키는지 -> false
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));   // 논리적으로 같은지 -> true

        String str3 = "hello";  //x003
        String str4 = "hello";  //x003
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}

