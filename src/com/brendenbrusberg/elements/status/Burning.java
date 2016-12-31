package com.brendenbrusberg.elements.status;

import com.brendenbrusberg.elements.chars.Character;

import io.github.bobjoetom.elements.status.Status;

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
