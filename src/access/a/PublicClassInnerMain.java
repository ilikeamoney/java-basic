package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        /*
        다른 클래스 안에서 inner class 로 선언해도
        위치가 같은 패키지면 접근할 수 있다.
         */
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
