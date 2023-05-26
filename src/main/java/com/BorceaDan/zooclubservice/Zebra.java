package com.BorceaDan.zooclubservice;

public class Zebra extends Animal implements AnimalInterface {
    public Zebra(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Zebra " + getName() + " says: Ihuhu");
    }
    @Override
        public void eat() {
            System.out.println(getName() + " is eating fish.");
        }
    }

