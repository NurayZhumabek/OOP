package GarageSimulatorwithVehicles;

public class Truck extends Vehicle{
    private int loadCapacity;
    public Truck(String name, int speed,int loadCapacity) {
        super(name, speed);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public void move() {
        super.move();
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
