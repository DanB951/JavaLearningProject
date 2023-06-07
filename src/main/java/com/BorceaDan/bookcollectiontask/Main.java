package com.BorceaDan.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] tablouDeDateInt = {1,2,3,4,0,3,5,6,4,3,2,4,3,5,5};

        System.out.println(intArrayManager.getTheMinValuesOfTheArray(tablouDeDateInt));
        System.out.println(intArrayManager.getTheMinValueIndexOfTheArray(tablouDeDateInt));
        System.out.println(intArrayManager.getTheAverageOfTheElements(tablouDeDateInt));
    }
}
