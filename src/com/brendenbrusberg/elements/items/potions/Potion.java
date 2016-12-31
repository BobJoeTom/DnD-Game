package com.brendenbrusberg.elements.items.potions;

import com.brendenbrusberg.elements.chars.Character;
import com.brendenbrusberg.elements.items.Item;

/**
 * Created by Brenden on 6/30/2016.
 */
public abstract class Potion extends Item {
    abstract public int affect(Character user);
}
