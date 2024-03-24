package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    String parkingLotId;
    String floorNumber;
    String slotNumber;

    String ticketId;
    String ticketIdDelimiter = "_";

    public Ticket(String parkingLotId, String floorNumber, String slotNumber) {
        this.floorNumber = floorNumber;
        this.parkingLotId = parkingLotId;
        this.slotNumber = slotNumber;
        this.ticketId = generateTicketId();
    }

    private String generateTicketId() {
        return this.parkingLotId + ticketIdDelimiter + this.floorNumber + ticketIdDelimiter + this.slotNumber;
    }
}
