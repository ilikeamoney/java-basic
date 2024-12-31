package static2.ex;

public class Car {
    private static int count = 0;
    private String carName;

    public Car(String carName) {
        System.out.println("차량 구매 = " + carName);
        this.carName = carName;
        count++;
    }

    public static void printCount() {
        System.out.println("현재 차량의 숫자는 = " + count);
    }
}
