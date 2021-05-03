package com.javalessons.oop.inheritance;

import java.util.ArrayList;

public class InheritanceMain {
    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);

        Auto truck = new Truck("Volvo", "VLN 300", truckEngine, 300,
                500, 1000);

        truck.start();
        truck.accelerate(40);

        System.out.println();
        Auto car = new ElectricCar("Tesla", "Model S", 4, 1000);
        car.start();

        System.out.println();
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Auto bus = new Bus("Mercedes", "Sprinter", busEngine,
                30, 75, 12);

        Engine engine = bus.getEngine();
        ArrayList<Piston> pistons = engine.getPistons();
        System.out.println(pistons.toString());

        runAuto(truck);
        runAuto(car);
        runAuto(bus);
    }

    public static void runAuto(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();
    }
}



