package com.BorceaDan.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result = ArithmeticOperationService.divideIntWithExceptionHandling(10,0);
        System.out.println(result);
        System.out.println("The program is running till the end");

        String stringValue = "Vadim;";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "src/main/java/com/BorceaDan/exceptionsservicetask";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist, the execution of the programme is not interrtupted");
        } finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);

        System.out.println("The program is running");
    }
}
