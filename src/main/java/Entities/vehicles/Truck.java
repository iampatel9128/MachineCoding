package Entities.vehicles;

import Entities.enums.VehicleTypes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Truck extends Vehicle {
    public Truck(String registrationNumber, String color) {
        super(VehicleTypes.TRUCK, registrationNumber, color);
    }
}
