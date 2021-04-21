package com.tts.day3.dealership;

public class LightTruck {

    public class TransferCase{
        private int numGears;

        public TransferCase(){
            this.numGears = 4;
        }

        public TransferCase(int gears){
            this.numGears = gears;
        }

        public int getNumGears(){
            return numGears;
        }
    }

    public TransferCase transferCase;

    public LightTruck(TransferCase transferCase){
        this.transferCase = transferCase;
    }

}
