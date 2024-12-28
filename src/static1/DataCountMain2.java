package static1;

public class DataCountMain2 {
    /*
    인스턴스 생성될 때 마다 값을 증가하는 카운터 객체를
    넘겨서 Data2 인스턴스를 생성함
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 a = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 b = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 c = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
