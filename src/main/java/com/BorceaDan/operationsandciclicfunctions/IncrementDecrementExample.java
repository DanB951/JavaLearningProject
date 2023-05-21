package com.BorceaDan.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 15;

        a++;
        System.out.println("Valoarea dupa incrementare: " + a);

        ++a;
        int b = ++a;
        int a1 = a;
        int c = a++;
        System.out.println("Valoarea dupa incrementare pre-fixata: " + a);
        System.out.println("Afiseaza b = " + b + " a1= " + a1 + " c = " + c + " a2= " + a);

        a--;
        System.out.println("Valoarea dupa decrementare: " + a);

        --a;
        System.out.println("Valoarea dupa decrementare pre-fixata: " + a);
    }
}
