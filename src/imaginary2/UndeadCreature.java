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
public abstract class UndeadCreature extends SciFiCharacter{
    private boolean allergicToSun;
    private String typeOfFood;
    
    public abstract void chasePrey();

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

    @Override
    public String findSciFiCharacterStory() {
        return SciFiCharacterStory;
    }
    
    
}
