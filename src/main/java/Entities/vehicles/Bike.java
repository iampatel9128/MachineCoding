package Entities.vehicles;

import Entities.enums.VehicleTypes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bike extends Vehicle {
    public Bike(String registrationNumber, String color) {
        super(VehicleTypes.BIKE, registrationNumber, color);
    }
}
