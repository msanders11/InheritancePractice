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
public class Vehicle {
    private String vehicleColor;
    private boolean isRunning = false;
    
    private void startVehicle(){
        isRunning = true;
        System.out.println("Vehicle has been started.");
    }
}
