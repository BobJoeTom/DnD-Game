package io.github.bobjoetom.map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.Stack;

import io.github.bobjoetom.MainClass;
import io.github.bobjoetom.elements.Character;
import io.github.bobjoetom.map.tiles.Tile;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Map {
    private int WIDTH;
    private int HEIGHT;
    //Map of tiles
    private ArrayList<Stack> map = new ArrayList<Stack>();//TODO MAYBE A STACK MAP
    private ArrayList<Tile> initMap = new ArrayList<Tile>();

    public void initMap(){
        for(int i = 0; i < (getMapHEIGHT()*getMapWIDTH()); i++){
            getMap().add(i, new Stack());
        }
        for(int i = 0; i < getInitMap().size(); i++){
            Tile tile = getInitMap().get(i);
            float x = tile.getX();
            float y = tile.getY();

            getMap().get(Math.round(y*getMapWIDTH()+ x)).add(tile);
        }
    }

    public void render(SpriteBatch sb, Character character){//Character is main point of perspective
            for(int y = character.getY() + 6; y >= character.getY()-6; y--){
                for(int x = character.getX()-4;x<= character.getX()+6;x++){
                    Tile tile = (Tile) getMap().get(y*getMapWIDTH()+x).peek();
                    float x1 = tile.getX();
                    float y1 = tile.getY();
                    sb.draw(tile.getTexture(),0+(x1*MainClass.WIDTH),0-(y1*MainClass.HEIGHT), MainClass.WIDTH/9, MainClass.HEIGHT/16);//STACK TO RENDER AND POSISTION
                }
            }
    }

    public ArrayList<Stack> getMap() {
        return map;
    }

    public void setMap(ArrayList<Stack> map) {
        this.map = map;
    }

    public ArrayList<Tile> getInitMap() {
        return initMap;
    }

    public void setInitMap(ArrayList<Tile> initMap) {
        this.initMap = initMap;
    }

    public int getMapWIDTH() {
        return WIDTH;
    }

    public void setMapWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getMapHEIGHT() {
        return HEIGHT;
    }

    public void setMapHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
}
