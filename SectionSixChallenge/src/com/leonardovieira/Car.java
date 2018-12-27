package com.leonardovieira;

public class Car extends Vehicle{
    private boolean isAutoPilot, isOn, isClutch;
    private int gear;


    public Car(String model) {
        super(model);
        this.isAutoPilot = false;
        this.isOn = false;
        this.isClutch = false;
        this.gear = 0;
    }

    public boolean isAutoPilot() {
        return isAutoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        if (isOn) {
            isAutoPilot = autoPilot;
            System.out.println("AutoPilot engaged.");
        }
            else{
            System.out.println("Turn on the car");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
        System.out.println(super.getModel() + " turned ON");
    }

    public boolean isClutch() {
        return isClutch;
    }

    public void setClutch(boolean clutch) {
        isClutch = clutch;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (isClutch && isOn)
            this.gear = gear;
            else
            System.out.println("Clutch first or turn on");
    }
}
