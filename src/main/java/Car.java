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

public class Car {
    private String make;
    private String model;
    private int mileage;
    
    public Car(){
        
    }
    
    public Car(String make, String model, int mileage){
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
    
    public String getMake(){
        return make;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getMileage(){
        return mileage;
    }
    
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    @Override
    public String toString(){
        return "Car " + "make = " +
                make + ", model = " +
                model + ", mileage = " +
                mileage + '}';
    }
    
}
