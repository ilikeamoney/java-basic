package extends1.super1;

public class Child extends Parent{
    public String value = "Child";

    @Override
    public void hello() {
        System.out.println("Child hello");
    }

    public void call() {
        /*
        부모와 자식간의 필드에서 선언된 변수가 이름이 같은 경우
        사용할때 this(자신) super(부모) 이렇게 구분하여 사용할 수 있다.
        만약 이렇게 사용하지 않고 호출하다 가장먼저 자식에 있는 값을 먼저 찾아 사용한
         */
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value);

        this.hello();
        super.hello();
    }
}
