package com.javalessons.oop.inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol,
               int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialised");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Bus car is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Bus car has stopped");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        super.fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Available petrol is " + getAvailablePetrol());
    }

    public void pickUpPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passengers");
    }

    public void releasePassenger() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }
}
