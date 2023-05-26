package com.BorceaDan.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal lion = new Lion("Eduardo");
        Zebra zebra = new Zebra("Fusion");
        Lion secondLion = new Lion("Pisic");

        lion.eat();

        zebra.makeSound();
        zebra.eat();
    }
}
