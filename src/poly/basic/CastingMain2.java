package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        // 실제 타입은 변하지 않는다.
        /*
        JVM은 인스턴스가 생성되는 시점에 해당 인스턴스의 정보를 기록해 둔다.
        지금과 같은경우에 참조타입은 부모 클래스지만 실제 생성하는 인스턴스는 자식 클래스이므로
        JVM은 인스턴스 정보를 저장해두고 사용하기 때문에 다운캐스팅시 일시적으로 자식이 정의해 놓은
        기능들에 접근 할 수 있다.

        반대로 업캐스팅은 자식 인스턴스는 부모에 기능들 정보도 담아두고 있기 때문에
        메모리상 실제로 참조가능하여 사용할 수 있다.
         */
        ((Child) poly).childMethod();
    }

}
