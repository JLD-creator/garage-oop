package org.ies.vehicles.components;
import  java.util.Scanner;

import org.ies.vehicles.model.VehicleType;
import  org.ies.vehicles.model.vehicle;

public class vehicleReader {
    private final  Scanner scanner;
    public  vehicleReader( Scanner scanner){
        this.scanner = scanner;
    }
    public vehicle read(){
        System.out.println("Introduce los datos del vehiculo");
        int option;
       do {
           System.out.println("Elige el tipo");
           System.out.println("1.Coche");
           System.out.println("2. Moto");
           System.out.println("3. Camion");
           option = scanner.nextInt();
           scanner.nextLine();
       }while (option != 1 && option != 2 && option != 3);
        VehicleType vehicleType;
        if (option ==1 ){
            vehicleType = VehicleType.Car;
        } else if (option == 2) {
            vehicleType = VehicleType.Motorbike;
        } else {
            vehicleType = VehicleType.Truck;
        }
        System.out.println("Velocidad maxima");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Color ");
        String color = scanner.nextLine();
        System.out.println("Matricula");
        String plate = scanner.nextLine();
        vehicle vehicle = new vehicle(vehicleType, maxSpeed, color, plate);
        return vehicle;
    }
}