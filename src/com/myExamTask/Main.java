package com.myExamTask;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("China", "model", OS.WINDOWS, 12);
        System.out.println(computer.checkOperatingSystemCompatibility(OS.MACOS));
        computer.setRamSize(19);
        System.out.println(computer);
    }
}
