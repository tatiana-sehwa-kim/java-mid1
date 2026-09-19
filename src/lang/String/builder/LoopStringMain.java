package lang.String.builder;

public class LoopStringMain {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String result = "";

        for (int i = 0; i < 100000; i++) {      // 10만 번 돌리는. StrinbBuilder 없이. for문에서는 최적화 되지 않는다.
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
// ...... Hello Java Hello Java Hello Java Hello Java
//time = 5596ms