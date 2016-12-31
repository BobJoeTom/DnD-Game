package io.github.bobjoetom.elements.Potions;

import io.github.bobjoetom.elements.Character;

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
