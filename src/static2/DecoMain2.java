package static2;

public class DecoMain2 {
    /*
    static 메서드는 단순히 본인에 멤버변수 사용을 하는 메서드가 아니라
    외부에서 단순히 기능만을 제공할때 보통 static 메서드를 정의한다.
     */

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before = " + s);
        System.out.println("after = " + deco);
    }
}
