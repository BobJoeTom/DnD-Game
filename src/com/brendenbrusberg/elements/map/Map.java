package com.brendenbrusberg.elements.map;

import java.util.ArrayList;
import java.util.Stack;

import com.brendenbrusberg.graphics.*;
import com.brendenbrusberg.Main;
import com.brendenbrusberg.elements.chars.Character;
import com.brendenbrusberg.elements.items.Item;
import com.brendenbrusberg.elements.map.tiles.Tile;

/**
 * Created by Brenden on 6/30/2016.
 */

//TODO FIX MAP RENDER, and LOAD, and stacks,load all characters onto map, have logic in game
public class Map {
    private int WIDTH;
    private int HEIGHT;
    //Map of tiles
    /*
    private ItemMap itemMap= new ItemMap();
    private CharMap charMap= new CharMap();
    private TileMap tileMap= new TileMap();
    */
    private ArrayList<ArrayList<Tile>> tileMap = new  ArrayList<ArrayList<Tile>>();
	private ArrayList<ArrayList<ArrayList<Item>>> itemMap = new ArrayList<ArrayList<ArrayList<Item>>>();
	private ArrayList<ArrayList<Character>> charMap = new  ArrayList<ArrayList<Character>>();

    
    public ArrayList<ArrayList<Tile>> getTileMap() {
		return tileMap;
	}

	public void setTileMap(ArrayList<ArrayList<Tile>> tileMap) {
		this.tileMap = tileMap;
	}

	public ArrayList<ArrayList<ArrayList<Item>>> getItemMap() {
		return itemMap;
	}

	public void setItemMap(ArrayList<ArrayList<ArrayList<Item>>> itemMap) {
		this.itemMap = itemMap;
	}

	public ArrayList<ArrayList<Character>> getCharMap() {
		return charMap;
	}

	public void setCharMap(ArrayList<ArrayList<Character>> charMap) {
		this.charMap = charMap;
	}

	public void initMap(){
    }

    public void render(float camX, float camY){//Cam x and y, casted to an int to truncate
    	int xStep = 0;
    	int yStep = 0;
    	for(int y = (int) camY - 6; y >= (int) camY+6; y--){
    		for(int x = (int) camX-10;x<= (int)camX+10;x++){
                tileMap.get(y).get(x).render(xStep, yStep);
                for(int i = 0; i < itemMap.get(y).get(x).size();i++){
                	itemMap.get(y).get(x).get(i).getImage().render();
                }
                charMap.get(y).get(x).getImage().render();
                xStep++;
    		}
    		yStep++;
    		xStep=0;
    	}
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
    /*
	public ItemMap getItemMap() {
		return itemMap;
	}

	public void setItemMap(ItemMap itemMap) {
		this.itemMap = itemMap;
	}

	public CharMap getCharMap() {
		return charMap;
	}

	public void setCharMap(CharMap charMap) {
		this.charMap = charMap;
	}

	public TileMap getTileMap() {
		return tileMap;
	}

	public void setTileMap(TileMap tileMap) {
		this.tileMap = tileMap;
	}
	*/
}
