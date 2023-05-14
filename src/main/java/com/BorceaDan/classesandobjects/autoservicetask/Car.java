package com.BorceaDan.classesandobjects.autoservicetask;

public class Car {

    int km;

    String gearType;

    String make;

    String model;

    int productionYear;

    double carPrise;

    String fuelType;

    Car(String make, String model, int productionYear, String fuelType) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        System.out.println("In urma executiei acestui constructor 4 parametri se creaza un nou obiect despre care nu cunoastem price, gearType si km");
    }

    Car(String make, String model){
        this.make = make;
        this.model = model;
        System.out.println("A fost creata o masina despre care cunoastem doar marca si model");
    }


}
