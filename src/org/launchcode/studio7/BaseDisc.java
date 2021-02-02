package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    String discName;
    Double capacity;
    String contents;

    public BaseDisc(String discName, Double capacity, String contents) {
        this.discName = discName;
        this.capacity = capacity;
        this.contents = contents;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void read(){
        System.out.println("Read process.");
    }
    public void write() {
        System.out.println(this.discName + " Write process");

    }
    public void checkCapacity(Double capacity){
        if (capacity == 0){
            System.out.println("The disk is empty.");
        }else if(capacity > 0 && capacity < 0.9) {
            System.out.println("There is more space to load data.");
        } else
            System.out.println("There is no empty space.");
    }



}
