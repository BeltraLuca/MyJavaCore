package com.beltraluca.excerises.warmup;

public class SDCar extends Car{ //extends estende alla classe genitore car SDcar avrà tutto di car

    boolean isSelfDriving;

    public SDCar(String licensePlate, boolean isSelfDriving) {
        super(licensePlate);        //riferimento classe genitore
        this.isSelfDriving = isSelfDriving;
    }

    public void turnSDOn(){
        this.isSelfDriving=true;
    }

    public void turnSDOff(){
        this.isSelfDriving=false;
    }
}
