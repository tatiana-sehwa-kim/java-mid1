package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println("string = " + string);
    }
}

//    Object 가 제공하는 기능은 다음과 같다.
//    객체의 정보를 제공하는 toString()
//    객체의 같음을 비교하는 equals()
//    객체의 클래스 정보를 제공하는 getClass()
//    기타 여러가지 기능