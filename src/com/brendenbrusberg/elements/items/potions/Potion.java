package io.github.bobjoetom.elements.Potions;

import io.github.bobjoetom.elements.Character;
import io.github.bobjoetom.elements.Item;

/**
 * Created by Brenden on 6/30/2016.
 */
public abstract class Potion extends Item {
    abstract public int affect(Character user);
}
