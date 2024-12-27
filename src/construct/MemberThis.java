package construct;

public class MemberThis {
    /*
    멤버변수와 지역변수 이름이 같다면
    this를 사용하지 않는 경우
    스코프가 더 가까운 변수를 사용한다.
     */

    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
