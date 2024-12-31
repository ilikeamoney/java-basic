package final1;

public class FinalFIeldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        ConstructInit con1 = new ConstructInit(10);
        ConstructInit con2 = new ConstructInit(20);
        System.out.println(con1.value);
        System.out.println(con2.value);

        /*
        final 필드 - 필드 초기화
        필드에서 직접적으로 초기화 됨
        인스턴스 마다 무조건 10으로 할당되기 떄문에 메모리가 낭비될 수 있음
        그러니 되도록 사용하지 말자
         */

        FieldInit filed1 = new FieldInit();
        FieldInit filed2 = new FieldInit();
        FieldInit filed3 = new FieldInit();
        System.out.println(filed1.value);
        System.out.println(filed2.value);
        System.out.println(filed3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
