package com.github.hanyaeger.tutorial.entities.Goons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.tutorial.Node;

import java.util.ArrayList;


public class Goon extends DynamicSpriteEntity {

    private com.github.hanyaeger.api.Coordinate2D Coordinate2D;
    private Coordinate2D lastNodeLocation;
    private  Coordinate2D nextNodeLocation;



    public Goon(String resource, Coordinate2D initialLocation, Node NodeList[]) {
        super(resource, initialLocation);
        compareLocation(NodeList);
    }

    void compareLocation(Node nodeList[]){
        for (int node = 0; node < nodeList.length - 1; node++) {
            if(this.getLocationInScene().equals(nodeList[node].getLocationInScene())){
                lastNodeLocation = nodeList[node].getLocationInScene();
                nextNodeLocation = nodeList[node + 1].getLocationInScene();
                System.out.println("Ik sta op punt " + node);
                System.out.println(nextNodeLocation);
            }
        }

    }
}
