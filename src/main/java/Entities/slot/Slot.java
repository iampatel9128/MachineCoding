package Entities.slot;

import Entities.enums.VehicleTypes;


public abstract class Slot {
    VehicleTypes type;
    Boolean isOccupied;
    Integer id;

    public Slot(VehicleTypes type, Integer id) {
        this.isOccupied = false;
        this.type = type;
        this.id = id;
    }
}
