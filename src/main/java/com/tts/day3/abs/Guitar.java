package com.tts.day3.abs;

public class Guitar extends Instrument{

    // this is an optional override
    // you do not need to override it
    @Override
    public boolean isThisAnInstrument(boolean value) {
        super.isThisAnInstrument(value);
        return value;
    }

    @Override
    public boolean createSound() {
        System.out.println("The guitar goes strum");

        return false;
    }
}
