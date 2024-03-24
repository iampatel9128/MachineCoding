package Entities;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String id;
    List<Floor> floors;

    public ParkingLot(int numberOfFloors, int numberOfSlotsPerFloor) {
        this.id = "PR1234";
        floors = new ArrayList<>();
        for(int i = 0; i < numberOfFloors; i++) {
            Floor newFloor = new Floor(i+1, numberOfSlotsPerFloor);
            floors.add(newFloor);
        }
    }
}
