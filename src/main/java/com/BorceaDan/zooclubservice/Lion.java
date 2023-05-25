package com.BorceaDan.zooclubservice;

public class Lion extends Animal implements AnimalInterface {
    public Lion(String name) {
        super (name);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion " + getName() + " says: Woof!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating meat.");
    }
}
