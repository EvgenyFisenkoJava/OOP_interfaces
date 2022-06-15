package ru.skypro;

public class Truck extends Vehicle implements ServiceTyre, ServiceEngine, ServiceTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }
    @Override
    public void checkEngine() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("Проверяем прицеп");
    }
}
