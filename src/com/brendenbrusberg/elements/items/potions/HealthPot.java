package com.brendenbrusberg.elements.items.potions;

import com.brendenbrusberg.elements.chars.Character;
/**
 * Created by Brenden on 7/2/2016.
 */
public class HealthPot extends Potion {

    public HealthPot(){
        setTexturePath("HealthPot.png");
    }
   
    public int affect(Character user) {
        return 0;
    }

}
