package com.tts.day3.abs;

public class Trumpet extends Instrument{
    @Override
    public boolean createSound() {

        System.out.println("Trumpet goes womp!");

        return false;
    }
}
