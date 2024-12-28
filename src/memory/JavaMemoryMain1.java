package memory;

public class JavaMemoryMain1 {
    /*
    stack은 선입후출로 가장 먼저 넣은 메서드가
    종료는 가장 나중에 되는 자료구조이다. 정처기에서도 많이 나옴
     */

    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
