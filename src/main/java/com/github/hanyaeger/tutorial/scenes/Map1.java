package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Node;


import java.util.ArrayList;

public class Map1 extends DynamicScene {

    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities(){
        String devIcon = "sprites/devIcon.png";
        ArrayList<Node> NodesMap1 = new ArrayList<>();
        Node punt0 = new Node(devIcon, new Coordinate2D(1,1));
        Node punt1 = new Node(devIcon, new Coordinate2D(getWidth() / 2, getHeight() / 2));
        NodesMap1.add(punt0);
        NodesMap1.add(punt1);

        for (Node node : NodesMap1) {
            addEntity(node);
        }
    }
}
