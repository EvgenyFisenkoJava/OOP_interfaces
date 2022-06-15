package ru.skypro;

public class Bicycle extends Vehicle implements ServiceTyre  {

        public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
    }
    @Override
    public void updateTyre() {
       System.out.println("Меняем покрышку");
    }
}
