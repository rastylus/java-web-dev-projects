package org.example;

public class Computer {
    private String software;
    private int ram;
    private double storage;


    public void computer(String software, int ram, double storage) {
        this.software = software;
        this.ram = ram;
        this.storage = storage;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }
}
