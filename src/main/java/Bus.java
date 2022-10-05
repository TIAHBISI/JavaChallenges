/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m2003744
 */
import java.util.Objects;

public class Bus {

    private String make;
    private String model;
    private int mileage;
    private String company;
    private int routenumber;

    public Bus(String make, String model, int mileage, String company, int RouteNumber) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.company = company;
        this.routenumber = routenumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
