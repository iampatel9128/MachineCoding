package Entities.slot;

import Entities.enums.VehicleTypes;
import Entities.slot.Slot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BikeSlot extends Slot {
    public BikeSlot(Integer id) {
        super(VehicleTypes.BIKE, id);
    }
}
