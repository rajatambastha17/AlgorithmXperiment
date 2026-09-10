package com.preps.javaconcepts.oopsconcepts.inheritance;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }

    @Override
    public String oilUsed() {
        return "mountain bike oil";
    }

//    public String getBikeName(){
//        return "MBike";
//    }
}
