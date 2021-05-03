package com.javalessons.oop.inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengersNumber;

    public ElectricCar(String producer, String model, int passengersNumber, int batteryVolume) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
        System.out.println("Electric car was initialised");
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Electric car is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Electric car has stopped");
    }

    @Override
    public void energize() {
        charge();
    }

    public void charge() {
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
