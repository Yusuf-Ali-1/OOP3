package com.tts.day3;

public class Car implements Driveable{

    public int speed;
    public int gear;



    @Override
    public void changeGear(int a) {
        System.out.println("This is changing the gear");
    }

    @Override
    public void accelerate(int a) {

    }

    @Override
    public void brake(int a) {

    }
}
