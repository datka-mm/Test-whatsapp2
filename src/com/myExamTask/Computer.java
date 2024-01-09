package com.myExamTask;

public class Computer implements ComputerInterface {

    private String madeOfCompany;
    private String model;
    private OS os;
    private int ramSize;

    public Computer(String madeOfCompany, String model, OS os, int ramSize) {
        this.madeOfCompany = madeOfCompany;
        this.model = model;
        this.os = os;
        this.ramSize = ramSize;
    }

    @Override
    public boolean checkOperatingSystemCompatibility(OS os) {
        return this.os.name().equals(os.name());
    }

    public void setRamSize(int newSize) {
        if (newSize > ramSize) {
            ramSize = newSize;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "madeOfCompany='" + madeOfCompany + '\'' +
                ", model='" + model + '\'' +
                ", os=" + os +
                ", ramSize=" + ramSize +
                '}';
    }
}
