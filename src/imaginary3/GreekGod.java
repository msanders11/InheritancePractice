/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary3;

/**
 *
 * @author Mike
 */
public class GreekGod extends MythologicalBeing {
    private boolean isOlympian;
    private String typeOfGod;

    public void battleWithTitans(){
        System.out.println("Fighting with the Titans.");
    }
    
    public boolean isIsOlympian() {
        return isOlympian;
    }

    public void setIsOlympian(boolean isOlympian) {
        this.isOlympian = isOlympian;
    }

    public String getTypeOfGod() {
        return typeOfGod;
    }

    public void setTypeOfGod(String typeOfGod) {
        this.typeOfGod = typeOfGod;
    }
    
    
    
}
