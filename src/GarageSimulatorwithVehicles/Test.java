package GarageSimulatorwithVehicles;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car("Lamborgini", 230);
        Vehicle bicycle = new Bicycle("Storm", 20);
        Garage garage = new Garage(3);
        garage.addVehicle(car);
        garage.addVehicle(bicycle);
        garage.displayInfo();
    }
}
