package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.tutorial.scenes.Level;


public class LevelTile extends TileMap {

    private Level level;

    public LevelTile(Level level){
        this.level = level;
    }


    @Override
    public void setupEntities() {
            addEntity(1, GoUp.class);
            addEntity(2, GoDown.class);
            addEntity(3, GoLeft.class);
            addEntity(4, GoRight.class);
            addEntity(5, PlaceableSpace.class, level);
            addEntity(6, Bank.class, level);
    }




    @Override
    public int[][] defineMap() {
        return new int[][]{
                {0,0,0,0,0,0,5,5,5,5,5,5,5,5,5,5,5,5},
                {4,0,0,0,2,0,0,0,0,0,0,0,5,5,5,5,5,5},
                {0,0,0,0,0,0,0,0,0,0,0,0,5,5,5,5,5,5},
                {5,5,5,0,0,0,0,4,0,0,0,0,0,0,0,0,0,0},
                {5,5,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
                {5,5,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {5,5,5,0,0,0,0,0,0,5,5,5,5,5,5,5,5,5},
                {5,5,5,0,0,0,0,0,0,5,5,5,5,5,5,5,5,5},
                {5,5,5,0,0,0,0,0,0,5,5,5,5,5,5,5,5,5},
                {5,5,5,0,4,0,0,1,0,5,5,5,5,5,5,5,5,5},
                {5,5,5,0,0,0,0,0,0,5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
        };
    }
}
