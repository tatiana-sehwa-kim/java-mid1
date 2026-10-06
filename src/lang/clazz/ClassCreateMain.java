package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {

        Class helloClass = Hello.class;
//        Class helloClass = Class.forName("lang.clazz.Hello");   // 둘 중에 하나

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
