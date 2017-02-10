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
public class Zombie extends UndeadCreature{
    private boolean isFull;
    
    
    
    public void consumeBrains(){
        System.out.println("Zombie is eating brains...");
        isFull = true;
    }

    public boolean isIsFull() {
        return isFull;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }
    
    
}
