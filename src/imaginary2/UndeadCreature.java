/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary2;

/**
 *
 * @author Mike
 */
public class UndeadCreature extends SciFiCharacter{
    private boolean allergicToSun;
    private String typeOfFood;
    
    public void chasePrey(){
        System.out.println("Run, it is behind you!");
    }

    public boolean isAllergicToSun() {
        return allergicToSun;
    }

    public void setAllergicToSun(boolean allergicToSun) {
        this.allergicToSun = allergicToSun;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
    
    
}
