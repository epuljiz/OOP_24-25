package pck_bidirectional;

public class CarFactory {

    private String carFatoryBrand;
    private Car car;

    public CarFactory(String brand) {
        this.carFatoryBrand = brand;
    }

    public Car produceCar (String model){
        this.car = new Car(model, this.carFatoryBrand, this);
        return this.car;
    }
}
