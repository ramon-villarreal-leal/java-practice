package StructuralDesignPatterns.AdapterPattern.AdapterPattern;

public class CarPriceCalculator implements PriceCalculator {
    private int age;
    private String model;
    public static int averageCarPrice = 6000;

    public CarPriceCalculator(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarPriceCalculator(int age, String model) {
        this.age = age;
        this.model = model;
    }
}
