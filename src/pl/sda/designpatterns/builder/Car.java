package pl.sda.designpatterns.builder;

public class Car {

    private int doorsCount;
    private double engine;
    private String make;
    private String model;
    private boolean hasAC;
    private boolean manualTransmission;
    private boolean hasRadio;

    public static class Builder {
        private int doorsCount = 4;
        private double engine = 1.3;
        private String make;
        private String model;
        private boolean hasAC;
        private boolean manualTransmission;
        private boolean hasRadio;

        Builder withDoorsCount(int doorsCount) {
            this.doorsCount = doorsCount;
            return this;
        }

        Builder withEngine(double engine) {
            this.engine = engine;
            return this;
        }

        Car build() {
            return new Car(doorsCount, engine, make, model, hasAC, manualTransmission, hasRadio);
        }
    }

    private Car(int doorsCount, double engine, String make, String model, boolean hasAC, boolean manualTransmission, boolean hasRadio) {
        this.doorsCount = doorsCount;
        this.engine = engine;
        this.make = make;
        this.model = model;
        this.hasAC = hasAC;
        this.manualTransmission = manualTransmission;
        this.hasRadio = hasRadio;
    }

    public static void main(String[] args) {
        final Car build = new Builder()
                .withDoorsCount(6)
                .withEngine(2.8).build();
    }
}
