package com.tts.day3.aggregation;

public class Programmer {

    public String name;

    //this defines a HAS-A relationship

    public Address programmerAddr;

    public Programmer(String name, Address address){
        this.name = name;
        this.programmerAddr = address;
    }
}
