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
public class Snake extends Reptile {

    private int length;
    private boolean isVenomous;

    @Override
    public void layInTheSun() {
        System.out.println("The snake is laying in the sun.");
    }

    public void consumePrey() {
        System.out.println("Snake is eating...");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isIsVenomous() {
        return isVenomous;
    }

    public void setIsVenomous(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }

}
