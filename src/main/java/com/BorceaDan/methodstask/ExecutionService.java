package com.BorceaDan.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getrRandomInt(100,400);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(250);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandmomDouble(1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandmomDouble(-1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars:" + DataGeneratorUtil.generateValidRandomString(256));
        System.out.println("Random Valid String de X chars:" + DataGeneratorUtil.generateValidRandomString(257));
        System.out.println("Random Invalid String de X chars:" + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer vasileConsumer = new Customer("Vasile Petrescu", 33, "abc@yahoo.com");

        System.out.println("Nume obiect Vasile: " + vasileConsumer.getName());
        System.out.println("Age obiect Vasile: " + vasileConsumer.getAge());
        System.out.println("Email obiect Vasile: " + vasileConsumer.getEmail());

        vasileConsumer.setName("Vasile Petrescu");
        vasileConsumer.setAge(5868);
        vasileConsumer.setEmail("abc@yahoo.com");

        System.out.println("Nume obiect Vasile: " + vasileConsumer.getName());
        System.out.println("Age obiect Vasile: " + vasileConsumer.getAge());
        System.out.println("Email obiect Vasile: " + vasileConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12), DataGeneratorUtil.getRandomInt(127),
                DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getrRandomInt(18,44));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

    }
}
