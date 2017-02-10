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
public class Footwear {
    private String material;
    private String size;
    private boolean shoesOn = false;
    
    public void putOnFootwear(){
        System.out.println("Putting on footwear");
        shoesOn = true;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
