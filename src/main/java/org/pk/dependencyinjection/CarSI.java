package org.pk.dependencyinjection;

public class CarSI {
    private Engine engine;

    //setter injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("The car is started " + engine.getType() + " engine");
        engine.start();
    }
}
