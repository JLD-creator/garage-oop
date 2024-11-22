package org.ies.vehicles;
import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.model.vehicle;
import org.ies.vehicles.model.VehicleType;
import org.ies.vehicles.model.Garage;
import org.ies.vehicles.components.vehicleReader;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GarageReader garageReader = new GarageReader(scanner, vehicleReader);
        Garage garage = garageReader.read();
        System.out.println(garage);
    }

}