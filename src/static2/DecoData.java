package static2;

public class DecoData {

    private int instanceValue;

    private static int staticValue;

    public static void staticCall(DecoData data) {
        /*
        이렇게 매개변수로 참조값을 넘기면 static 영역에서도 접근할 수 있다.
         */
        data.instanceValue++;
        data.instanceMethod();
    }

    public static void staticCall() {
        /*
        정적 메서드에서 인스턴스 변수와 메서드 호출은 접근할 수 있는
        인스턴스 주소가 없기 때문에 Null을 호출하는 것과 마찬가지이다.

        JVM 실행시 모든 클래스 정적 데이터들이 모두 로드 되기 때문에
        접근 영역에서 보면 가장 위에 있는 영역이라고 생각하면 된다.

        하지만 인스턴스 영역은 무조건 생성을하고 힙영역에 할당이 되기 떄문에
        선택적 메모리를 할당한다고 생각하자
         */

//        instanceValue++; 정적 메소드에서 인스턴스 변수 접근 불가
//        instanceMethd(); 정적 메소드에서 인스턴스 메소드 호출 불가

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메소드에 접근
    }

    public void instanceCall() {
        /*
        인스턴스 영역에서는 정적변수와 메서드는 모두 공통으로 사용되는 요소이기 때문에
        문제 없이 잘 호출할 수 있다.
         */

        instanceValue++; // 인스턴스 변수에 접근
        instanceMethod(); // 인스턴스 메소드에 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메소드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

}
