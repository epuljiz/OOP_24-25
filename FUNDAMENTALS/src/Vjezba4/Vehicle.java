package Vjezba4;

import java.util.Date;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected Date productionDate;

    private int vehID;
    private static int ctdIDVeh = 10;
    private static final String datePattern = "dd.MM.yyyy";

    protected Vehicle(String model) {
        this.model = model;
        this.vehID = ctdIDVeh++;

    }

    protected Vehicle(String model, String brand) {
        this(model);
        this.brand = brand;

    }


    public void start(){
        System.out.println("Starting some: "+ this. getClass().getSimpleName());

    }

    public void stop() {
        System.out.println("Stoping this: "+ this. getClass().getSimpleName());
    }
    protected abstract void info();
}
