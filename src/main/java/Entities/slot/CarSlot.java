package Entities.slot;

import Entities.enums.VehicleTypes;
import Entities.slot.Slot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarSlot extends Slot {
    public CarSlot(Integer id) {
        super(VehicleTypes.CAR, id);
    }
}
