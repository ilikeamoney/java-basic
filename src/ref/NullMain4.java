package ref;

public class NullMain4 {
    public static void main(String[] args) {
        /*
        멤버 변수에 참조형이 포함되어 있다면
        참조형 데이터에도 반드시 인스턴스를 할당해야
        NullPointException이 발생하지 않는다.
         */

        BigData bd = new BigData();
        bd.data = new Data();
        System.out.println("bigData.count = " + bd.count);
        System.out.println("bigData.data = " + bd.data);

        System.out.println("bigData.data.value = " + bd.data.value);
    }
}
