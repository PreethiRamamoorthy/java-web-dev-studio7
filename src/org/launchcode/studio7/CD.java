package org.launchcode.studio7;

public class CD extends BaseDisc {
    public CD(String discName, Double capacity, String contents) {
        super(discName, capacity, contents);
    }
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }
    @Override
    public void storeData() {
        System.out.println("CD has low storage than DVD.");
    }
//
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
