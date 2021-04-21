package com.tts.day3.abs;

public class Guitar extends Instrument{
    @Override
    public boolean createSound() {
        System.out.println("The guitar goes strum");

        return false;
    }
}
