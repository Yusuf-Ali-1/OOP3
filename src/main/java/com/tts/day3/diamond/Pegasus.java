package com.tts.day3.diamond;

public class Pegasus implements Speakable , Flyable{
    @Override
    public void doSpeak() {
        System.out.println("nweet");
    }

    @Override
    public void doFly() {
        System.out.println("This legend can fly! ");
    }
}
