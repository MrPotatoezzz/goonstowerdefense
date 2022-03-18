package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Node;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;


import java.util.ArrayList;

public class Map1 extends DynamicScene {

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities(){
        String devIcon = "sprites/devIcon.png";
        Node punt0 = new Node(devIcon, new Coordinate2D(1,1));
        Node punt1 = new Node(devIcon, new Coordinate2D(getWidth() / 2, getHeight() / 2));

        Node NodesMap1[] = {
                punt0,
                punt1
        };

        Goon goon = new Goon("sprites/devIcon.png" , new Coordinate2D(0,0) , NodesMap1);
        addEntity(goon);

        for (Node node : NodesMap1) {
            addEntity(node);
        }
    }
}
