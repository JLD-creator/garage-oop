package org.ies.vehicles;
import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.components.VehicleReader;
import org.ies.vehicles.model.Garage;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GarageReader garageReader = new GarageReader(scanner, new VehicleReader(scanner));
        Garage garage = garageReader.read();
        System.out.println(garage);
    }

}