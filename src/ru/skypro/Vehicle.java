package ru.skypro;

public abstract class Vehicle {

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName() {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public void setWheelsCount() {
        this.wheelsCount = wheelsCount;
    }
}
