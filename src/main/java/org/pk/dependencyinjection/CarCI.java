package org.pk.dependencyinjection;

public class CarCI {
    private Engine engine;
    //constructor
    public CarCI(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("car is starting with " + engine.getType() + " engine");
        engine.start();
    }
}
