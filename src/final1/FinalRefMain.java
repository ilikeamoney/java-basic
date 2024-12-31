package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // 참조값은 변경 불가
        final Data data = new Data();
        // data = new Data();

        // 참조 대상의 값은 변경 가능
        data.value = 20;
        System.out.println(data.value);
        data.value = 30;
        System.out.println(data.value);
    }
}
