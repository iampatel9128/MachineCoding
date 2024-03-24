package Entities.vehicles;

import Entities.enums.VehicleTypes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends Vehicle {
    public Car(String registrationNumber, String color) {
        super(VehicleTypes.CAR, registrationNumber, color);
    }
}
