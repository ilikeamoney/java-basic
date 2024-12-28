package static2;

/*
해당 클래스 정적영역의 메서드를 호출하겠다는 선언 (클래스 부분을 적을 필요 없음)
 */
import static static2.DecoData.*;
import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출 1");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        // 인스턴스 참조 주소를 넘김
        staticCall(decoData2);

        // 추가
        // 인스턴스를 통한 접근
        // 이것도 정적변수와 마찬가지로 힙영역에서 한번 확인을 하고
        // 정적인걸 알아차리고 다시 메서드영역에서 호출한다.
        // 사용 X
        DecoData deco3 = new DecoData();
        deco3.staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}
