package com.brendenbrusberg.elements.items.armor;

import com.brendenbrusberg.elements.items.Item;
import com.brendenbrusberg.graphics.Image;

/**
 * Created by Brenden on 6/30/2016.
 */
public abstract class Armor extends Item{
    //Speacialty will be with specific armor class
    //Maybe overide the get armor code to get armor and do extra things
    int armor;
    private java.lang.Character user;
    private java.lang.Character attacker;

    public Character getUser() {
        return user;
    }

    public void setUser(Character user) {
        this.user = user;
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public abstract void speacial();
}
