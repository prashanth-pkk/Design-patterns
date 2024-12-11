package org.pk.dependencyinjection;

public class DIContainer {
    public static CarCI createCarWithCI() {
        Engine engine = new Engine();
        return new CarCI(engine);
    }

    public static CarSI createCarWithSI() {
        Engine engine = new Engine();
        CarSI carSI = new CarSI();
        carSI.setEngine(engine);
        return carSI;
    }
}
