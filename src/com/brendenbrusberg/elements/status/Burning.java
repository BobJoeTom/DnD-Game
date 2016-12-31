package io.github.bobjoetom.elements.status;

import io.github.bobjoetom.elements.Character;

/**
 * Created by Brenden on 7/5/2016.
 */
public class Burning extends Status{
    public Burning(Character character) {
        super(character);
    }

    @Override
    public void getAffect() {
       getCharacter().setHealth(getCharacter().getHealth()-1);
    }
}
