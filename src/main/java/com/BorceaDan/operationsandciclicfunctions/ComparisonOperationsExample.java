package com.BorceaDan.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        boolean isNotEgual = a != b;
        System.out.println("Diferit de: " + isNotEgual);

        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decat: " + isGreaterThan);

        boolean isLessThan = a < b;
        System.out.println("Mai mic decat: " + isLessThan);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare sau agal cu: " + isGreaterThanOrEqual);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("Mai mic sau egal cu: " + isLessThanOrEqual);
    }
}
