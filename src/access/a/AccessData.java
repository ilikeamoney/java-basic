package access.a;

public class AccessData {
    /*
    private 클래스 내부에서만 접근가능
    default 같은 패키지 안에서만 접근가능
    protected 같은 패키지 안에서만 허용 상속 관계라면 다른 패키지에서도 접근가능
    public 외부 접근 모두 허용
     */



    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerMethod() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
