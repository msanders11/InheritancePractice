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
public abstract class SciFiCharacter {
    private String name;
    private String characterOrigin;
    String SciFiCharacterStory;
    
    public abstract String findSciFiCharacterStory();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterOrigin() {
        return characterOrigin;
    }

    public void setCharacterOrigin(String characterOrigin) {
        this.characterOrigin = characterOrigin;
    }
    
    
}
