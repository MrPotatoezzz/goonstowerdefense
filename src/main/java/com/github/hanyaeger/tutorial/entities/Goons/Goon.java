package com.github.hanyaeger.tutorial.entities.Goons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.tutorial.entities.map.*;


public class Goon extends DynamicSpriteEntity implements Collided {

    public Direction direction;


    public Goon(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
        setSpeed(1);
        setDirection(Direction.DOWN.getValue());
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof goUp){
            setDirection(Direction.UP.getValue());
        } else if(collider instanceof goDown){
            setDirection(Direction.DOWN.getValue());
        } else if(collider instanceof goLeft){
            setDirection(Direction.LEFT.getValue());
        }else if(collider instanceof goRight){
            setDirection(Direction.RIGHT.getValue());
        }
    }

//    private void moveToNextNode(Node nodeList[]) {
//
//        for (int i = 0; i < nodeList.length; i++) {
////            setDirection(Direction(getLocationInScene()));
////        }
////            lastNodeLocation = nodeList[0];
////            nextNodeLocation = nodeList[lastNodeLocation + 1];
//            setSpeed(1);
//            setDirection(angleTo(nodeList[i]));
//            System.out.println("Goon location: " + goonLocation);
//            if(nodeList[i].getLocationInScene().equals(this.getLocationInScene())){
//                setDirection(angleTo(Node nodeList[i + 1]));
//        }
//    }

//    public void compareLocation(Node nodeList[]){
//        for (int node = 0; node < nodeList.length - 1; node++) {
//            System.out.println(node);
//            if (this.goonLocation.equals(nodeList[node])) {
//                lastNodeLocation = nodeList[node];
//                nextNodeLocation = nodeList[node + 1];
//                //System.out.println("Ik sta op punt " + node);
//                System.out.println("0: " + lastNodeLocation);
//                System.out.println("1: " + nextNodeLocation);
//                //System.out.println(nextNodeLocation);
//            } else {
//                moveToNextNode(nodeList);
//            }
//        }
//    }
}
