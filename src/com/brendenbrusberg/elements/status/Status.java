package com.brendenbrusberg.elements.status;

import com.brendenbrusberg.elements.chars.Character;

/**
 * Created by Brenden on 7/5/2016.
 */
//Stattus objects are placed in a chracters status arraylistt

public abstract class Status {

    //Chracter that is being affected
    private Character character;

    public Status(Character character){
        this.character = character;
    }//OverRide


    public void getAffect(){
        //Overriden by and status class and is called by a character each turn
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
