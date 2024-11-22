package org.ies.vehicles;
import org.ies.vehicles.model.vehicle;
import org.ies.vehicles.model.VehicleType;
import org.ies.vehicles.model.Garage;

public class Main {
    public static void main(String[] args) {
        vehicle Vehicle = new vehicle(VehicleType.Car,200,"Blanco","27478JKL");
        vehicle Vehicle2 = new vehicle(VehicleType.Truck,150, "Negro", "5776489JKK");
        vehicle Vehicle3 = new vehicle(VehicleType.Motorbike, 300, "Amarillo Y Rojo", "85945LKJ");
        vehicle[] vehiculos = {Vehicle, Vehicle2, Vehicle3};
        Garage garage = new Garage("Perico", "C/ Melancolia", vehiculos);
        System.out.println(garage);
    }

}