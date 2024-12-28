package memory;

/*
메서드 같은 경우는 스택구조로 실행되지만
인스턴스 같은 경우에는 해당 인스턴스에 접근할 수 있는 주소에 활성화 범위가
큐구조로 사라진다.
 */

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data2.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}
