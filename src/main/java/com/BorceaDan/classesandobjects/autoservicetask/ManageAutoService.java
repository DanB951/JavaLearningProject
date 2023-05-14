package com.BorceaDan.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
//       Declararea si initializarea obiectelor folosind toate tipurile de constructori
        Garage garajulLuiIon = new Garage("Lunca Nistrului");
        System.out.println("Adresa garajului lui Andrei este " + garajulLuiIon.address);
        garajulLuiIon.carCapacity = 2250;
        garajulLuiIon.hasComputerDiagnostics = true;
        garajulLuiIon.numberid = "236562/t";
        garajulLuiIon.scheduler = "weekdays";

        System.out.println("Garajul lui Ion are urmatoarele proprietati: Adresa: " + garajulLuiIon.address + " CarCapacity: "
                + garajulLuiIon.carCapacity + " numberId: " + garajulLuiIon.numberid+" orar de lucru: " + garajulLuiIon.scheduler
                +" are elevator: " + garajulLuiIon.hasComputerDiagnostics);

        Garage garajulLuiVasile = new Garage( "Lunca Prutului");
        garajulLuiVasile.carCapacity = 1599;
        garajulLuiVasile.hasComputerDiagnostics = false;
        garajulLuiVasile.numberid = "000255/s";
        garajulLuiVasile.scheduler = "weekends";

        System.out.println("Garajul lui Vasile are urmatoarele proprietati: Adresa" + garajulLuiVasile.address + " CarCapacity:"
                + garajulLuiVasile.carCapacity + " numberId:" + garajulLuiVasile.numberid+" orar de lucru:" + garajulLuiVasile.scheduler
                +" are elevator:" + garajulLuiVasile.hasComputerDiagnostics);

        System.out.println("Adresa garajului lui Vasea este " + garajulLuiVasile.address);

        Garage garajulLuiMircea = new Garage(365);
        garajulLuiMircea.address = "V Alecsandri";
        garajulLuiMircea.hasComputerDiagnostics = true;
        garajulLuiMircea.numberid = "022255-m";
        garajulLuiMircea.scheduler = "7-days";

        System.out.println("Garajul lui Mircea are urmatoarele proprietati: Adresa" + garajulLuiMircea.address + " CarCapacity"
                + garajulLuiMircea.carCapacity + " numberId" + garajulLuiMircea.numberid+" orar de lucru" + garajulLuiMircea.scheduler
                +" are elevator" + garajulLuiMircea.hasComputerDiagnostics);

        System.out.println("Capacitatea garajul lui Mircea = " + garajulLuiMircea.carCapacity);

        Car masinaLuiNicolae = new Car("Skoda","Octavia",2020,"Diesel");

        masinaLuiNicolae.carPrise = 21500;
        masinaLuiNicolae.km = 1000000;
        masinaLuiNicolae.gearType = "Automat";

        System.out.println("Masina lui Iulian are urmatoarele proprietati: Make:" + masinaLuiNicolae.make + ", Model: " +
                masinaLuiNicolae.model + ", Production year: " + masinaLuiNicolae.productionYear + ", Fuel Type: " + masinaLuiNicolae.fuelType +
                ", Pretul: " + masinaLuiNicolae.carPrise +", Km: " + masinaLuiNicolae.km + ", Gear Type: " + masinaLuiNicolae.gearType);

        Tool elevatorTool = new Tool(564465465);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = false;
        elevatorTool.needsElectricity = true;

        System.out.println("Obiectul  are proprietatile:" +
                "Cod unic:" + elevatorTool.uniqueCode +
                "Este elevator:" + elevatorTool.isElevator +
                "Este utilizat:" + elevatorTool.isUsed +
                "Instrument electric:" + elevatorTool.needsElectricity);

        Tool hammerTool = new Tool();
        System.out.println(hammerTool);

        Worker muncitorIgor = new Worker();
        muncitorIgor.age = 35;
        muncitorIgor.isExperienced = false;
        muncitorIgor.name = "Alexandru";
        muncitorIgor.sexType = "masculin";

        System.out.println("Caracteristicile muncitorului:" +
                "Nume:" + muncitorIgor.name +
                "Varsta:" + muncitorIgor.age +
                "Experimentat:" + muncitorIgor.isExperienced +
                "Gen:" + muncitorIgor.sexType);




    }
}
