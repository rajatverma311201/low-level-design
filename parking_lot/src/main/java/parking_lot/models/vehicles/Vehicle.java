package parking_lot.models.vehicles;

import parking_lot.enums.VehicleType;

public abstract class Vehicle {
    private String licenseNumber;
    private VehicleType type;

    public Vehicle() {
    }

    public Vehicle(String licenseNumber, VehicleType type) {
        this.licenseNumber = licenseNumber;
        this.type = type;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
