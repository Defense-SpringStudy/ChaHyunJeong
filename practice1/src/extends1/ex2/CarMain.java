package extends1.ex2;

import extends1.ex2.GasCar;
import extends1.ex2.ElectricCar;

public class CarMain {

    public static void main(String[] args) {
        extends1.ex2.ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        extends1.ex2.GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
