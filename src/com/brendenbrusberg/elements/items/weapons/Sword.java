package io.github.bobjoetom.elements.Weapons;

/**
 * Created by Brenden on 7/2/2016.
 */
public class Sword extends Weapon {
    public Sword(){
        setName("Sword");
        setDiscription("This is a sword");
        setTexturePath("Sword.png");
        //setTexture(getTexturePath());
        setDamage(99999);
    }

    @Override
    public void speacial() {
    /*Methods that can be used
    getUser(); retuens User of Item
    getVictim(); gets victim of Weapon

    each of these return a character object IE the user or Vitim

     */
    }
}
