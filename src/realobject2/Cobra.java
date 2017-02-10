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
public class Cobra extends Snake {
    private String typeOfCobra;
    private boolean isRaisedUp;
    
    public void spitVenon(){
        System.out.println("Cobra just spit venom");
    }

    public String getTypeOfCobra() {
        return typeOfCobra;
    }

    public void setTypeOfCobra(String typeOfCobra) {
        this.typeOfCobra = typeOfCobra;
    }

    public boolean isIsRaisedUp() {
        return isRaisedUp;
    }

    public void setIsRaisedUp(boolean isRaisedUp) {
        this.isRaisedUp = isRaisedUp;
    }
    
    
}
