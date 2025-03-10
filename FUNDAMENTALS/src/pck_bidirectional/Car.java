package pck_bidirectional;

public class Car {

    private String model;
    private String brand;
    private CarFactory carFatoryBrand;

    public Car(String model, String brand, CarFactory carFatoryBrand) {
        this.brand = brand;
        this.carFatoryBrand = carFatoryBrand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", carFatoryBrand=" + carFatoryBrand +
                '}';
    }
}
