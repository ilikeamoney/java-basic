package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모타입 참조에서 부모 객체 생성
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식타입 참조에서 자식 객체 생성
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        // 리스코프 치환 원칙으로 자식은 최소한 부모가 가지고있는 기능들은 수행할 수 있어야 한다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 자식 메서드는 호출 불가
        // poly.childMethod();

        // 자식은 부모객체를 받을 수 없다
        // Child child1 = new Parent();
    }
}
