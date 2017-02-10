/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realobject2;

/**
 *
 * @author Mike
 */
public class Reptile {
    private String habitat;
    private String colorOfScales;
    
    
    private void layInTheSun(){
        System.out.println("Reptile is laying in the sun.");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColorOfScales() {
        return colorOfScales;
    }

    public void setColorOfScales(String colorOfScales) {
        this.colorOfScales = colorOfScales;
    }
    
    
    
}
