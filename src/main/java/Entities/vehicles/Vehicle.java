package Entities.vehicles;

import Entities.enums.VehicleTypes;

public abstract class Vehicle {
    VehicleTypes type;
    String registrationNumber;
    String color;

    public Vehicle(VehicleTypes vehicleTypes, String registrationNumber, String color) {
        this.type = vehicleTypes;
        this.registrationNumber = registrationNumber;
        this.color = color;
    }
}
