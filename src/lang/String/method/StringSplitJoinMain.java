package lang.String.method;

public class StringSplitJoinMain {
    static void main(String[] args) {

        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");   //Apple
        for (String s : splitStr) {                 //Banana
            System.out.println(s);                  //Orange
        }

        // join()
        String joinedStr = String.join("-", "A","B","C");
        System.out.println("연결된 문자열: " + joinedStr);            //연결된 문자열: A-B-C

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);                   //result = Apple-Banana-Orange
    }
}
