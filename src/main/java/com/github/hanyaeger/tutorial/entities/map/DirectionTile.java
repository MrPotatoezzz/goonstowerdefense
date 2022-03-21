package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.scenes.TileMap;


public class DirectionTile extends TileMap {


    @Override
    public void setupEntities() {
            addEntity(1, goUp.class);
            addEntity(2, goDown.class);
            addEntity(3, goLeft.class);
            addEntity(4, goRight.class);
    }




    @Override
    public int[][] defineMap() {
        return new int[][]{
                {0,0,0,0,0,0,0,0,0,0},
                {4,4,4,4,2,0,0,0,0,0},
                {0,0,0,0,2,0,0,0,0,0},
                {0,0,0,0,2,0,0,4,4,4},
                {0,0,0,0,2,0,0,1,0,0},
                {0,0,0,0,4,4,4,1,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0}
        };
    }
}
