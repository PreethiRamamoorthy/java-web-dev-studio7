package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("CD1",0.9,"Music");
        DVD myDVD = new DVD("DVD1",0.9,"Movies");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.spinDisc();
        myDVD.spinDisc();
        myCD.storeData();
        myDVD.storeData();
        myCD.read();
        myCD.write();
        myCD.checkCapacity(10.0);
    }
}
