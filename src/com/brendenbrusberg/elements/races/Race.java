package io.github.bobjoetom.elements.Races;

import com.badlogic.gdx.graphics.Texture;

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
    private Texture texture;

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = new Texture(texture);
    }

    public String getTexturePath() {
        return texturePath;
    }

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
        setTexture(getTexturePath());
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
