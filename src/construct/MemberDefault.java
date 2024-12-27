package construct;

public class MemberDefault {
    /*
    생성자를 정의하지 않고 호출하면 자바 컴파일러가 기본 생성자를 생성 해준다.
     */

    String name;

    MemberDefault() {
        System.out.println("기본 생성자 호출");
    }

}
