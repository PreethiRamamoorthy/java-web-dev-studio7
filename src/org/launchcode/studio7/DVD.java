package org.launchcode.studio7;

public class DVD extends BaseDisc {
    public DVD(String discName, Double capacity, String contents) {
        super(discName, capacity, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("DVD has higher storage than CD.");
    }

//    @Override
//    public void read() {
//
//    }
//
//    @Override
//    public void write() {
//
//    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
