package io.github.bobjoetom.map.tiles;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Wall extends Tile{

    private String texturePAth2 = "Wall2.png"; //Perspective of a flat wall, news another texture made

    public Wall(int x, int y){
        setTexturePath("Wall.png");//Top pf wall from top down persepective
        setX(x);
        setY(y);
    }
}
