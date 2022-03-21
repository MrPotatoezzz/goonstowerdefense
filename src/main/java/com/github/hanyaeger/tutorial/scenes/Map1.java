package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.map.DirectionTile;

public class Map1 extends DynamicScene implements TileMapContainer {

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities(){
      //  String devIcon = "sprites/devIcon.png";



//                {1, 1},
//                {getWidth() / 3, getHeight() / 3},
//                {getWidth() / 2, getHeight() / 2}
        Goon goon = new Goon("sprites/devIcon.png" , new Coordinate2D(0,0));
        addEntity(goon);

        };

    @Override
    public void setupTileMaps() {
        addTileMap(new DirectionTile());
    }


//        Node punt0 = new Node(devIcon, new Coordinate2D(1, 1));
//        Node punt1 = new Node(devIcon, new Coordinate2D(getWidth() / 3, 1));
//        Node punt2 = new Node(devIcon, new Coordinate2D(getWidth() / 3, getHeight() / 2));

//        Node NodesMap1[] = {
//                punt0,
//                punt1,
//                punt2
//        };


//
//        for (Node node : NodesMap1) {
//            addEntity(node);
//        }
//    }
}
