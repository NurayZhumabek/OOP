package GarageSimulatorwithVehicles;


public class Vehicle {
    private String name;
    private int speed;

    // количество колес транспорта
    private int amountOfWheels;

    // тип транспорта
    private VehicleType type;

    public Vehicle(String name, int speed, int amountOfWheels, VehicleType type) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Transport is ready to go");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
