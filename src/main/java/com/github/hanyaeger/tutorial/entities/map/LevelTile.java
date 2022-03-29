package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.tutorial.scenes.Map1;


public class LevelTile extends TileMap {

    private Map1 level;

    public LevelTile(Map1 level){
        this.level = level;
    }

    @Override
    public void setupEntities() {
            addEntity(1, goUp.class);
            addEntity(2, goDown.class);
            addEntity(3, goLeft.class);
            addEntity(4, goRight.class);
            addEntity(5, PlaceableSpace.class, level);
            addEntity(6, Bank.class, level);
    }




    @Override
    public int[][] defineMap() {
        return new int[][]{
                {5,5,5,5,5,5,5,5,5,5,0,0},
                {4,0,0,0,2,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,4,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,6},
                {0,0,0,0,4,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {5,5,5,5,5,5,5,5,5,5,0,0},
                {5,5,5,5,5,5,5,5,5,5,0,0},
                {5,5,5,5,5,5,5,5,5,5,0,0}
        };
    }
}
