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
public class Car extends Vehicle {

    private String makeOfCar;
    private int numberOfDoors;
    
    @Override
    public void startVehicle() {
        System.out.println("The car was started.");
    }

    public void honkCarHorn() {
        System.out.println("Honk Honk");
    }

    public String getMakeOfCar() {
        return makeOfCar;
    }

    public void setMakeOfCar(String makeOfCar) {
        this.makeOfCar = makeOfCar;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
