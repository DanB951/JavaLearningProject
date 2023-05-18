package com.BorceaDan.accesmodifiers;

import com.BorceaDan.accesmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person diegoMaradona = new Person(2315641546757l);
        diegoMaradona.address = "Argentina";
        diegoMaradona.gender = "Masculin";
        System.out.println(diegoMaradona.toString());
        Person.printNumarDePersoane();

        Person lionelMessi = new Person(6456545454l, "Lionel Messi", true, 36);
        lionelMessi.address = "Argentina Spain";
        lionelMessi.gender ="Masculin";
        System.out.println(lionelMessi.toString());
        Person.printNumarDePersoane();

        Person cristianoRonaldo = new Person(5464545454l, "Cristiano Ronaldo", false, 38);
        cristianoRonaldo.gender ="Masculin";
        cristianoRonaldo.address = "Portugalia";
        System.out.println(cristianoRonaldo.toString());
        Person.printNumarDePersoane();

        Person didieDrogba = new Person(546454545454l, "Didie Drogba", true, 45);
        didieDrogba.gender = "Masculin";
        didieDrogba.address = "Africa";
        System.out.println(didieDrogba.toString());
        Person.printNumarDePersoane();

    }

}


