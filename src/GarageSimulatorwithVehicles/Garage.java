package GarageSimulatorwithVehicles;

import java.util.Arrays;

public class Garage {
    Vehicle[] vehicles;

    public Garage(int size) {
        this.vehicles = new Vehicle[size];
    }

    public Garage(Vehicle[] vehicle) {
        this.vehicles = vehicle;
    }

    public void addVehicle(Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                break;
            }

        }

    }

    public void removeVehicle(Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].equals(vehicle)) {
                vehicles[i] = null;
                break;
            }
        }
    }

    public void displayInfo() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }
}
