package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        // 전부 호출 가능
        publicValue = 1;

        // 같은 패키지 내부에서 접근 가능
        // 상속 관계에서만 다른 패키지에서에 접근 가능
        protectedValue = 2;

        // 같은 패키지 내부에서만 접근 가능
//        defaultValue = 3;

        // 클래스 내부에서만 접근 가능
//        privateValue = 4;

        publicMethod();
        protectedMethod();

//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
