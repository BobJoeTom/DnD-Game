package com.brendenbrusberg.elements.chars;

import com.brendenbrusberg.graphics.Image;

import java.util.ArrayList;

import com.brendenbrusberg.elements.chars.CharClass;
import com.brendenbrusberg.elements.races.Race;
import com.brendenbrusberg.elements.status.Status;
import com.brendenbrusberg.elements.items.weapons.Weapon;
import com.brendenbrusberg.elements.items.Item;
import com.brendenbrusberg.elements.items.armor.Armor;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Character {
    private int x,y;
    private String name;
    private Race race;
    private CharClass charClass;

    //TODO MAKE SURE WEAPON AND ARMOR GET A CHARACTER FOR USER AND ATTACKER
    private Weapon weaponItem;
    private Armor armorItem;

    //Stats
    private int vitality;
    private int damage;
    private int health;
    private int armor;

    //Effector Stats
    private int stanima;
    private int dexiterity;
    private int intelli;
    private int strength;

    //Textures
    private String texturePath;//TODO will be race, setRace will also set texture
    private Image image;


    private ArrayList<Item> inventory = new ArrayList<Item>();
    private ArrayList<Status> statusAffects = new ArrayList<Status>();

    public Character() {
        x = 0;
        y = 0;
        name = "";
        race = null;
        charClass = null;
        weaponItem = null;
        armorItem = null;
        vitality = 10;
        health = 10;
        armor = 0;
        stanima = 0;
        dexiterity = 0;
        intelli = 0;
        strength = 0;
    }

    public void update(){
        for(int i = 0; i <statusAffects.size(); i ++){
            statusAffects.get(i).getAffect();
        }
    }


    public String getTexturePath() {
        return image.getTexturePath();
    }

    public void setTexturePath(String texturePath) {
        image.setTeturePath(texturePath);
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        vitality -= race.getVitality();
        stanima -= race.getStanima();
        dexiterity -= race.getDexiterity();
        intelli -= race.getIntelli();
        strength -= race.getStrength();
        this.race = race;
        vitality += race.getVitality();
        stanima += race.getStanima();
        dexiterity += race.getDexiterity();
        intelli += race.getIntelli();
        strength += race.getStrength();
    }

    public CharClass getCharClass() {
        return charClass;
    }

    public void setCharClass(CharClass charClass) {
        vitality -= race.getVitality();
        stanima -= charClass.getStanima();
        dexiterity -= charClass.getDexiterity();
        intelli -= charClass.getIntelli();
        strength -= charClass.getStrength();
        this.charClass = charClass;
        vitality += race.getVitality();
        stanima += charClass.getStanima();
        dexiterity += charClass.getDexiterity();
        intelli += charClass.getIntelli();
        strength += charClass.getStrength();
    }

    public Weapon getWeaponItem() {
        return weaponItem;
    }

    public void setWeaponItem(Weapon weaponItem) {
        damage -= weaponItem.getDamage() + strength;
        this.weaponItem = weaponItem;
        damage = weaponItem.getDamage() + strength;
    }

    public Armor getArmorItem() {
        return armorItem;
    }

    public void setArmorItem(Armor armorItem) {
        this.armorItem = armorItem;
        armor = armorItem.getArmor();

    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getStanima() {
        return stanima;
    }

    public void setStanima(int stanima) {
        this.stanima = stanima;
    }

    public int getDexiterity() {
        return dexiterity;
    }

    public void setDexiterity(int dexiterity) {
        this.dexiterity = dexiterity;
    }

    public int getIntelli() {
        return intelli;
    }

    public void setIntelli(int intelli) {
        this.intelli = intelli;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
