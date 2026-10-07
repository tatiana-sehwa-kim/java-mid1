package nested.Inner.ex2;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();         // 바깥 클래스에서 내부 클래스의 인스턴스 생성
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }


    public class Engine {
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);        // 바깥 클래스에 인스턴스 접근가능 -> car. 없어도 됨
            System.out.println(model + "의 엔진을 구동합니다.");            // Car 클래스 정보에 접근 가능
        }
    }
}
