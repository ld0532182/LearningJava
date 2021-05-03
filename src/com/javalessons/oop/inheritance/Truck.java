package com.javalessons.oop.inheritance;

public class Truck extends FuelAuto {

    private int cargoWeight;

    public Truck(String producer, String model, Engine engine, int availablePetrol,
                 int tankVolume, int cargoWeight) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Truck was initialised");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Truck car is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Truck car has stopped");
    }

    public void load() {
        System.out.println("Cargo loaded");
    }

    public void unload() {
        System.out.println("Cargo unloaded");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
