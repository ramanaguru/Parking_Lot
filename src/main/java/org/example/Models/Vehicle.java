package org.example.Models;

public class Vehicle extends BaseModel {
    private String Vechile_Number;
    private VehicleType vehicleType;

    private String owner_name;

    public String getVechile_Number() {
        return Vechile_Number;
    }

    public void setVechile_Number(String vechile_Number) {
        Vechile_Number = vechile_Number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
}
