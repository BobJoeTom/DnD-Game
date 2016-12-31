package io.github.bobjoetom.elements.Weapons;

/**
 * Created by Brenden on 6/30/2016.
 */
public class OneHandedAx extends Weapon{
    public OneHandedAx(){
        setName("One Handed Ax");
        setDiscription("This is an ax");
        setTexturePath("OneHandAx.png");
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
