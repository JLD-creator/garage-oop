package org.ies.vehicles.components;

import java.util.Scanner;

import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.vehicle;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleReader vehicleReader;
    public GarageReader(Scanner scanner, VehicleReader vehicleReader){
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }
    public Garage read(){
        System.out.println("Introduce los datos del garaje");
        System.out.println("Nombre");
        String nombre = scanner.nextLine();
        System.out.println("Direccion ");
        String direccion = scanner.nextLine();
        System.out.println("Cuantos vehiculos hay");
        int size = scanner.nextInt();
        scanner.nextLine();
        vehicle[] vehicles = new vehicle[size];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i]= vehicleReader.read();

        }

        return new Garage(nombre, direccion, vehicles);
    }
}
