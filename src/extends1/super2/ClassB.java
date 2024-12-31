package extends1.super2;

public class ClassB extends ClassA {

    /*
    만약 기본생성자가 아닌
    매개변수를 사용한 생성자를 정의한 경우
    자바 컴파일러는 기본생성자를 만들어 주지 않는다
    따라서 자식클래스에서 직접 부모클래스의 생성자를 호출하고 사용하여야 한다.
     */

    public ClassB(int a) {
        super(); // 부모의 기본생성자 호출은 생략 가능
        System.out.println("ClassB Constructor A = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB a = " + a + " ClassB b = " + b);
    }
}
