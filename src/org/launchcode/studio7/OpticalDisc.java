package org.launchcode.studio7;

public interface OpticalDisc {

    static final String discType = "Disc";
//    static final String discDataWrite = "Laser";
//    static final String discDataRead = "Laser";
    void spinDisc();
    void storeData();
    void read();
    void write();

}
