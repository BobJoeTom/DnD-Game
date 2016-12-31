package io.github.bobjoetom.elements.Weapons;

import io.github.bobjoetom.elements.Item;

/**
 * Created by Brenden on 6/30/2016.
 */
public abstract class Weapon extends Item {
    //Speacialty will be with specific weapon class
    //Maybe overide the get damage code to get damage and do extra things
    private Character user;
    private Character victim;
    private int damage;

    public Character getUser() {
        return user;
    }

    public void setUser(Character user) {
        this.user = user;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract void speacial();
}
