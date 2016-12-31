package com.brendenbrusberg.elements.map;

import java.util.ArrayList;

import io.github.bobjoetom.map.tiles.Floor;
import io.github.bobjoetom.map.tiles.Tile;
import io.github.bobjoetom.map.tiles.Wall;

/**
 * Created by Brenden on 6/30/2016.
 */
public class FirstMap extends Map {

    public FirstMap(){
        setMapHEIGHT(100);
        setMapWIDTH(100);
        //THIS IS WHERE YOU ADD ROOMS
        for(int x = 0; x < 20; x++){
            for(int y = 0; y < 20; y++){
                if(y==0||y==19){
                    getInitMap().add(new Wall(x, y));
                }
                else if((x>0&&x<19)&&(y==0||y==19)){
                    getInitMap().add(new Floor(x, y));
                }
                else{
                    getInitMap().add(new Floor(x, y));
                }
            }
        }
        initMap();

    }

}
