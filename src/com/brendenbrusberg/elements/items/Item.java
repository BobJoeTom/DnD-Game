package com.brendenbrusberg.elements.items;

import com.brendenbrusberg.graphics.Image;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Item {
    private String name;
    private String discription;
    private int x, y;
    private int ap;
    private Image image;
    public final int WIDTH = 120;
    public final int HEIGHT = 120;
    
    public String getTexturePath() {
        return image.getTexturePath();
    }

    public void setTexturePath(String texturePath) {
        image.setTeturePath(texturePath);
    }
    
    public Image getImage(){
    	return image;
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
    
    public int getAP() {
        return ap;
    }

    public void setAP(int ap) {
        this.ap = ap;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
