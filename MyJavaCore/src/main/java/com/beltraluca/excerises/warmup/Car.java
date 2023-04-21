package com.beltraluca.excerises.warmup;

public class Car{
    boolean isOn;
    String licensePlate;

    public Car(String licensePlate){
        this.isOn=false;
        this.licensePlate=licensePlate;
    }

    public void turnOn(){
        isOn=true;
    }

    public void turnOff(){
        isOn=false;
    }


}
