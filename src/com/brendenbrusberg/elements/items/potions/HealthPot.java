package com.brendenbrusberg.elements.items.potions;

/**
 * Created by Brenden on 7/2/2016.
 */
public class HealthPot extends Potion {

    public HealthPot(){
        setTexturePath("HealthPot.png");
    }
    @Override
    public int affect(Character user) {
        return 0;
    }
}
