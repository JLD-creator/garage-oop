package org.ies.vehicles.components;

import java.util.Arrays;
import java.util.Objects;

public class vehicleReader {
    private String name;
    private String address;
    private int[] Vehicule;

    public int[] getVehicule() {
        return Vehicule;
    }

    public void setVehicule(int[] vehicule) {
        Vehicule = vehicule;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "vehicleReader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Vehicule=" + Arrays.toString(Vehicule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vehicleReader that = (vehicleReader) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.deepEquals(Vehicule, that.Vehicule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, Arrays.hashCode(Vehicule));
    }
}
