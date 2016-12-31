package io.github.bobjoetom.elements;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Item {
    private String name;
    private String discription;
    private int x, y;
    private String texturePath;
    private Texture texture;
    public final int WIDTH = 120;
    public final int HEIGHT = 120;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
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

}
