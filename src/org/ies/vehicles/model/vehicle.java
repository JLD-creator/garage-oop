package org.ies.vehicles.model;

import java.util.Objects;

public class vehicle {
    private VehicleType VehicleType;
    private int max_Speed;
    private String color;
    private String plate;

    public vehicle(org.ies.vehicles.model.VehicleType vehicleType, int max_Speed, String color, String plate) {
        VehicleType = vehicleType;
        this.max_Speed = max_Speed;
        this.color = color;
        this.plate = plate;
    }

    public org.ies.vehicles.model.VehicleType getVehicleType() {
        return VehicleType;
    }

    public int getMax_Speed() {
        return max_Speed;
    }

    public String getColor() {
        return color;
    }

    public String getPlate() {
        return plate;
    }

    public void setVehicleType(org.ies.vehicles.model.VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public void setMax_Speed(int max_Speed) {
        this.max_Speed = max_Speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vehicle vehicle = (vehicle) o;
        return max_Speed == vehicle.max_Speed && VehicleType == vehicle.VehicleType && Objects.equals(color, vehicle.color) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VehicleType, max_Speed, color, plate);
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "VehicleType=" + VehicleType +
                ", max_Speed=" + max_Speed +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }

}
