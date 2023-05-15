package com.BorceaDan.classesandobjects.autoservicetask;

public class Garage {

    String address;

    boolean hasComputerDiagnostics;

    int carCapacity;

    String numberid;

    String scheduler;

    Garage(String adressaDataLaCreare) {
        this.address = adressaDataLaCreare;
        System.out.println("A fost creat un garaj");

        }

        Garage(int carCapacity){
        this.carCapacity = carCapacity;
        }
    }


