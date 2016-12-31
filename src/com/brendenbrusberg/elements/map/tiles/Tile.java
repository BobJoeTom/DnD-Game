package com.brendenbrusberg.elements.map.tiles;

import com.brendenbrusberg.graphics.Image;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Tile {
    private float x, y;
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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getTexturePath() {
        return texturePath;
    }

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
        setTexture(getTexturePath());
    }
}
