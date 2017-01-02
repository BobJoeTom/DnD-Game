package com.brendenbrusberg.elements.races;

import com.brendenbrusberg.graphics.Image;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Race {
    private int vitality;
    private int stanima;
    private int dexiterity;
    private int intelli;
    private int strength;

    private String texturePath;
    private Image image;

    

    public String getTexturePath() {
        return texturePath;
    }

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
        image.setTexture(texturePath);
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
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
}
