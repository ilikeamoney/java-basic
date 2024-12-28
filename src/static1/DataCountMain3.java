package static1;

public class DataCountMain3 {
    /*
    클래스 멤버변수 정적변수 = 메서드 영역
    메서드 = 스택 영역
    인스턴스 = 힙 영역

    정적변수는 메서드 영역에서 관리하기 때문에
    힙 영역에서 관리하는 인스턴스 변수에서 접근할 수 없다.
     */


    public static void main(String[] args) {
        Data3 a = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 b = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 c = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        // 힙영역에 접근 했다가 static 변수인걸 확인하고
        // 다시 메서드 영역에서 접근한다.
        // 권장하지 않음
        Data3 d = new Data3("D");
        System.out.println(d.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
