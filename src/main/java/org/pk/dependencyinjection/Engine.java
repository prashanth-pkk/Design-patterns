package org.pk.dependencyinjection;

public class Engine {
    private String type;

    public Engine() {
        this.type = "V8";
    }

    public void start() {
        System.out.println(type + " engine is started");
    }

    public String getType() {
        return type;
    }
}
