package extends1.overring;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("ElectricCar charge");
    }

    /*
    부모클래스에서 물려받은 메서드를 재정의해서 사용하고 싶을 때
    오버라이딩을 할 수 있다.

    오버라이딩 에노테이션을 사용하면 컴파일러가
    알려주기 떄문에 내가 구현하지 않은 오버라이딩 메서드를 정확하게 알 수 있다.
     */

    @Override
    public void move() {
        System.out.println("electricCar move fast");
    }
}
