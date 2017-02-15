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
public abstract class Monster extends Character {

    private int numberofEyes;
    private String originOfMonster;

    @Override
    public void communicate() {
        System.out.println("The monster is speaking.");
    }

    public abstract void scarePeople();

    public int getNumberofEyes() {
        return numberofEyes;
    }

    public void setNumberofEyes(int numberofEyes) {
        this.numberofEyes = numberofEyes;
    }

    public String getOriginOfMonster() {
        return originOfMonster;
    }

    public void setOriginOfMonster(String originOfMonster) {
        this.originOfMonster = originOfMonster;
    }

}
