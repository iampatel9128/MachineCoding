package Entities.enums;

public enum VehicleTypes {
    CAR("Car"),
    BIKE("Bike"),
    TRUCK("Truck");

    final String vehicleType;
    VehicleTypes(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }
}
