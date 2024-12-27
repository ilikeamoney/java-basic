package pack;


import pack.a.User;

/*
다른 패키지에 같은 이름에 클래스가 존재한다면
어쩔 수 없이 경로를 모두 다 적어야한다.
자주 사용하는 클래스는 그대로 쓰고
자주 사용하지 않는 클래스를 전체 경로로 적어서 사용한다.
 */

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User user = new pack.b.User();
    }
}
