package Entities.slot;

import Entities.enums.VehicleTypes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TruckSlot extends Slot {
    public TruckSlot(Integer id) {
        super(VehicleTypes.TRUCK, id);
    }
}
