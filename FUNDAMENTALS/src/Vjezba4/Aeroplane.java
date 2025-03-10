package Vjezba4;

public class Aeroplane extends Vehicle {

    private int numberOfEnginesOnWings;

    public Aeroplane(String model) {
        super(model);
    }
    public Aeroplane(String model, String brand) {
        super(model, brand);
    }

    public Aeroplane(String model, String brand, int numberOfEnginesOnWings) {
        super(model, brand);
        this.numberOfEnginesOnWings = numberOfEnginesOnWings;

    }

    @Override
    protected void info() {
        System.out.println("This is and aeroplane...");

    }
    public void flyWIthOneEngine(){}
}
