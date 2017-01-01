package com.brendenbrusberg.elements.map;

import java.util.ArrayList;
import java.util.Stack;

import com.brendenbrusberg.graphics.*;
import com.brendenbrusberg.Main;
import com.brendenbrusberg.elements.chars.Character;
import com.brendenbrusberg.elements.map.tiles.Tile;

/**
 * Created by Brenden on 6/30/2016.
 */

//TODO FIX MAP RENDER, and LOAD, and stacks,load all characters onto map, have logic in game
public class Map {
    private int WIDTH;
    private int HEIGHT;
    //Map of tiles
    private ItemMap itemMap= new ItemMap();
    private CharMap charMap= new CharMap();
    private TileMap tileMap= new TileMap();
    
    public void initMap(){
    }

    public void render(Character character){//Character is main point of perspective
    	for(int y = character.getY() + 6; y >= character.getY()-6; y--){
    		for(int x = character.getX()-4;x<= character.getX()+4;x++){
                  /*
                   * 
                   */
    		}
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
}
