package com.BorceaDan.accesmodifiers.peopleevidence;

public class Person {

    private static int numarTotalDePersoane;
    private int age;
    public String gender;
    public String name;
    private final long CNP;
    public String address;
    protected String phone;
    Double height;
    String eyeColor;
    Double weight;
    String education;
    boolean isMarried;
    String readingBook;
    String emailAddress;
    String occupation;

    public Person(long CNPObligatoriuLaCreare){
        CNP = CNPObligatoriuLaCreare;
        numarTotalDePersoane++;
    }

    public Person(long CNP, String name, boolean isMarried, int age){
       this.CNP = CNP;
       this.name = name;
       this.isMarried = isMarried;
       this.age = age;
       numarTotalDePersoane++;
    }

    public static void printNumarDePersoane(){
        System.out.println("Numarul total de persoane este: " + numarTotalDePersoane);
    }

public long getCNP(){
        return CNP;
}

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", CNP=" + CNP +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", height=" + height +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", isMarried=" + isMarried +
                ", readingBook='" + readingBook + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}


