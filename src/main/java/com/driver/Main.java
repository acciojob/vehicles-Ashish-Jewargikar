package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        //System.out.println("hello");
        WaterVehicle boat = new Boat("Titanic", 1500);
        String name = boat.getVehicleName();
        int capacity = boat.getVehicleCapacity();
        System.out.println(name+" "+capacity);
    }
}