/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realobject3;

/**
 *
 * @author Mike
 */
public class Shoe extends Footwear{
    private String brand;
    private String shoeFastenerStyle;
    private boolean shoesOn;
    
    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShoeFastenerStyle() {
        return shoeFastenerStyle;
    }

    public void setShoeFastenerStyle(String shoeFastenerStyle) {
        this.shoeFastenerStyle = shoeFastenerStyle;
    }

    @Override
    public void putOnFootwear() {
        shoesOn = true;
    }
    
    
}
