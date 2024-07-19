package dev.bego.vehicle;

import dev.bego.vehicle.enums.CarType;
import dev.bego.vehicle.enums.Color;
import dev.bego.vehicle.enums.FuelType;

public class AppVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Ferrari", 1997, 2.5, FuelType.DIESEL, CarType.CITY_CAR, 2, 4, Color.RED, 250, 0);

        vehicle.display();

        vehicle.setCurrentSpeed(100);
        System.out.println("Your current speed is: " + vehicle.getCurrentSpeed() + " km/h");

        vehicle.accelerate(20);
        System.out.println("Your current speed after accelerating is: " + vehicle.getCurrentSpeed() + " km/h");

        vehicle.decelerate(50);
        System.out.println("Your current speed after decelerating is: " + vehicle.getCurrentSpeed() + " km/h");

        vehicle.brake();
        System.out.println("You have now stopped, your speed is: " + vehicle.getCurrentSpeed() + " km/h");
    }
    
}
