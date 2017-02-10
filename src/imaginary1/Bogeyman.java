/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary1;

/**
 *
 * @author Mike
 */
public class Bogeyman extends Monster {
    private String bogeymanAppearance;
    private boolean isHidingUnderTheBed;

    
    public void hideUnderTheBed(){
        isHidingUnderTheBed = true;
        System.out.println("The bogeyman is under the bed...");
    }
    
    public boolean isHidingUnderTheBed() {
        return isHidingUnderTheBed;
    }

    public void setIsHidingUnderTheBed(boolean isHidingUnderTheBed) {
        this.isHidingUnderTheBed = isHidingUnderTheBed;
    }

    public String getBogeymanAppearance() {
        return bogeymanAppearance;
    }

    public void setBogeymanAppearance(String appearance) {
        this.bogeymanAppearance = appearance;
    }


    
    
}
