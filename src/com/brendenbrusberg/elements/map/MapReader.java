package com.brendenbrusberg.elements.map;

import com.brendenbrusberg.elements.items.Item;
import com.brendenbrusberg.elements.map.tiles.Tile;
import com.brendenbrusberg.utils.FileUtils;

public class MapReader {
	
	private Map map;
	private String mapString;
	
	public Map getMap(){
		return map;
	}
	
	public void loadMap(String mapPath){
		mapString = FileUtils.loadAsString(mapPath);
		int i = 0;
		int x = 0;
		int y = FileUtils.countLines(mapString);
		map.setMapHEIGHT(y);
		while(i < mapString.length()){
			if(mapString.substring(i, i+1).equals("{")){
				String entry="";
				i++;
				while(!mapString.substring(i, i+1).equals("}")){
					entry+=mapString.substring(i, i+1);
					i++;
				}
				x++;
				String[] elements = entry.split(",");
				reflect(x, y, elements);
			}
			if(mapString.substring(i, i+1).equals("/n")){
				y--;
				x=0;
			}
		}
	}
	
	public void reflect(int x, int y, String[] elements){
		for(int i = 0; i < elements.length;i++){
			String id = elements[i].substring(0, 4);
			if(id.equals("tile")){
				Class tile;
				try {
					tile = Class.forName(elements[i]);
					try {
						map.getTileMap().getList().get(y).add((Tile) tile.newInstance());
					} catch (InstantiationException | IllegalAccessException e) {
						System.err.println("Error Accesing Tile Map");
						e.printStackTrace();
					}
				} catch (ClassNotFoundException e) {
					System.err.println("Error reading File, no class matching name");
					map.getTileMap().getList().get(y).add(null);
					e.printStackTrace();
				}
				
			}else
			if(id.equals("item")){
				Class item;
				try {
					item = Class.forName(elements[i]);
					try {
						map.getItemMap().getList().get(y).get(x).add((Item) item.newInstance());
					} catch (InstantiationException | IllegalAccessException e) {
						System.err.println("Error Accesing Item Map");
						e.printStackTrace();
					}
				} catch (ClassNotFoundException e) {
					System.err.println("Error reading File, no class matching name");
					map.getItemMap().getList().get(y).get(x).add(null);
					e.printStackTrace();
				}
			
			}else
			if(id.equals("char")){
				Class characters;
				try {
					characters = Class.forName(elements[i]);
					try {
						map.getCharMap().getList().get(y).add((Character) characters.newInstance());
					} catch (InstantiationException | IllegalAccessException e) {
						System.err.println("Error Accesing Character Map");
						e.printStackTrace();
					}
				} catch (ClassNotFoundException e) {
					System.err.println("Error reading File, no class matching name");
					map.getTileMap().getList().get(y).add(null);
					e.printStackTrace();
				}
				
			}
		}
		
	}

}
