package org.pk.dependencyinjection;

public class Test {
    public static void main(String[] args) {

        //using setter injection
        CarSI carSI = DIContainer.createCarWithSI();
        carSI.start();

        CarCI carCI = DIContainer.createCarWithCI();
        carSI.start();
    }
}
