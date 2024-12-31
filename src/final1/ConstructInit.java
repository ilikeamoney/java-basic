package final1;

public class ConstructInit {

    /*
    필드에 final 사용할 경우 생성자를 통해 값을 할당해야한다.
     */
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
