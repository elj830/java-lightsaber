package com.galvanize;

public class Laptop {


    private boolean power = false;

    public boolean isOn() {
        return power;
    }

    public void power() {
        power = !power;
    }

//    public boolean isPower() {
//        return power;
//    }
//
//    public void setPower(boolean power) {
//        this.power = power;
//    }
}
