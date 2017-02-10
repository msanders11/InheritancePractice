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
public class Zeus extends GreekGod {
    private String magicalPowers;
    private boolean isRulerOfGods = true;
    
    
    public void throwThunderBolts(){
        System.out.println("Zeus is throwing thunderbolts!");
    }

    public String getMagicalPowers() {
        return magicalPowers;
    }

    public void setMagicalPowers(String magicalPowers) {
        this.magicalPowers = magicalPowers;
    }

    public boolean isIsRulerOfGods() {
        return isRulerOfGods;
    }

    public void setIsRulerOfGods(boolean isRulerOfGods) {
        this.isRulerOfGods = isRulerOfGods;
    }
 
    
}
