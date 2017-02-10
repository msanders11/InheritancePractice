/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realobject3;

/**
 *
 * @author Mike
 */
public class RunningShoe extends Shoe {

    private boolean shoesTied;
    private String typeOfSupport;
    private int distanceRanInShoes;
    private int totalDistanceRanInShoes = 0;

    public void tieShoes() {
        System.out.println("Tying shoes...");
        shoesTied = true;
    }

    public void putShoesOnForRun() {
        System.out.println("Putting running shoes on to go for a run");
    }

    public int getDistanceRanInShoes() {
        return distanceRanInShoes;
    }

    public void setDistanceRanInShoes(int distanceRanInShoes) {
        this.distanceRanInShoes = distanceRanInShoes;
    }

    public int getTotalDistanceRanInShoes() {
        return totalDistanceRanInShoes;
    }

    public void setTotalDistanceRanInShoes(int distanceRanInShoes) {
        totalDistanceRanInShoes += distanceRanInShoes ;
    }

    public boolean isShoesTied() {
        return shoesTied;
    }

    public void setShoesTied(boolean shoesTied) {
        this.shoesTied = shoesTied;
    }

    public String getTypeOfSupport() {
        return typeOfSupport;
    }

    public void setTypeOfSupport(String typeOfSupport) {
        this.typeOfSupport = typeOfSupport;
    }
}
