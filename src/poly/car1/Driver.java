package poly.car1;

public class Driver {

    private Car car;

    public void setCar (Car car) {
        System.out.println("차를 설정합니다." + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("drive");

        car.startEngine();
        car.pressAccelerator();
        car.stopEngine();
    }

}
