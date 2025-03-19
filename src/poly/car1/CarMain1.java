package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car k3 = new K3Car();
        Car model3 = new Model3Car();
        driver.setCar(k3);
        driver.drive();

        driver.setCar(model3);
        driver.drive();
    }
}
