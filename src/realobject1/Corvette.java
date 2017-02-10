/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realobject1;

/**
 *
 * @author Mike
 */
public class Corvette extends Car {

    private String model;
    private String year;
    private boolean isConvertible;

    @Override
    public void startVehicle() {
        System.out.println("Corvette was started.");
    }

    public void putTheTopDown() {
        if (isConvertible) {
            System.out.println("Putting the top down...");
        } else {
            System.out.println("This car is not a convertible.");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isIsConvertible() {
        return isConvertible;
    }

    public void setIsConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

}
