package com.tts.day3.dealership;

public class LightTruck {

    private boolean is4WD;

    public LightTruck() {


    }

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

    // This lightTruck has a perperty/field
    // that is of type transfer case
    public TransferCase transferCase;
    public Integer amountOfWheels;

    public LightTruck(boolean is4WD){
        this.is4WD = is4WD;

        if(this.is4WD){
            this.transferCase = new TransferCase();
        }
    }

    public LightTruck(boolean is4WD, TransferCase transferCase){
        this.is4WD = is4WD;
        this.transferCase = transferCase;
    }

}
