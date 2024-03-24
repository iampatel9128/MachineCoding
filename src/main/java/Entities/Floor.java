package Entities;

import Entities.slot.BikeSlot;
import Entities.slot.CarSlot;
import Entities.slot.Slot;
import Entities.slot.TruckSlot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    Integer id;
    List<BikeSlot> bikeSlots;
    List<CarSlot> carSlots;
    List<TruckSlot> truckSlots;

    public Floor(Integer id, Integer slots) {
        this.id = id;
        truckSlots = List.of(new TruckSlot(getNextSlotId()));
        bikeSlots = List.of(new BikeSlot(getNextSlotId()), new BikeSlot(getNextSlotId() + 1));
        carSlots = new ArrayList<>();
        slots -= 3;
        while(slots > 0) {
            carSlots.add(new CarSlot(getNextSlotId()));
            slots--;
        }
    }

    private Integer getNextSlotId() {
        return carSlots.size() + bikeSlots.size() + truckSlots.size() + 1;
    }
}
