package extends1.overring;

public class Car {

    /*
    부모에게 상속받은 메서드는 오버라이딩 하거나 구현하지 않아도 된다.

    부모입장에서는 자기 기능을 누가 상속을 받는지 알 수가 없다.
    자식은 부모 기능을 사용할 수 있지만
    부모는 자식 기능을 사용할 수 없다.
    상속은 단 하나의 클래스의 상속을 허용한다.

    메모리 구조는
    참조값은 하나지만 상속에 관한 모든 인스턴스를 메모리에 할당한다
    내부에서는 자식의 공간 부모의 공간 구분이 되어서 관리한다.
    그리고 참조변수 타입으로 우선순위를 구분한다 만약 자식타입에 메서드가 없는경우에
    본인이 상속받은 부모 클래스에서 확인한다.

    찾는 메서드가 없는경우 게속 상위 타입에 클래스를 확인한다.
     */
    public void move() {
        System.out.println("Car move");
    }

    // 추가
    /*
    상속한 모든 자식클래스에 메서드를 추가 하고싶다면
    부모 클래스에 메서드를 추가한다.
     */
    public void openDoor() {
        System.out.println("Car open door");
    }
}
