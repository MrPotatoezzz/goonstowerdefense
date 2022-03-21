package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.scenes.TileMap;
import javafx.scene.Node;

import java.util.Optional;

public class DirectionTile extends TileMap {


    public void getDirection(){

    }

    public void getNewAchorpoint(){

    }

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
                {0,0,0,0,3,3,3,1,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0}
        };
    }
}
