package lang.object;

// 부모 클래스가 없으면 묵시적으로 Object를 상속 받는다.
public class Parent extends Object{
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
