package com.BorceaDan.classesandobjects.autoservicetask;

public class Tool {

    boolean needsElectricity;

    boolean isElevator;

    boolean isUsed;

    long uniqueCode;

    Tool(){
        System.out.println("A fost creat un instrument despre care nimic nu se stie");
    }

    Tool(long uniqueCodeParam){
        uniqueCode = uniqueCodeParam;
        System.out.println("A fost creat un nou instrument despre care se cunoaste doar codul");
    }

}
