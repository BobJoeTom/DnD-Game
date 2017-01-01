package com.brendenbrusberg.elements.map;

import java.util.ArrayList;

import com.brendenbrusberg.elements.items.Item;


public class ItemMap {
	ArrayList<ArrayList<ArrayList<Item>>> items;
	
	public ArrayList<ArrayList<ArrayList<Item>>> getList(){
		return items;
	}
	public void render(int x, int y){
		items.get(y).get(x)
	}
	public void update(){
		
	}
}
