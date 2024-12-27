package ref;

public class NullMain2 {
    public static void main(String[] args) {
        /*
        참조할 주소가 없는데 해당 주소에 접근해서 멤버변수를 출력하는 경우
        NullPointException이 발생한다.
         */

        Data data = null;
        data.value = 10;
        System.out.println("data.value = " + data.value);
    }
}
