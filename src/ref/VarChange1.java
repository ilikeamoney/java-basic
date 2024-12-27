package ref;

import class1.Student;

public class VarChange1 {
    public static void main(String[] args) {
        /*
        변수 복사이다
        a값을 b가 복사하였기 때문에 a값이 바뀌어도 b의 값은 여전히 그대로이다.
         */

        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
