package com.github.hanyaeger.tutorial.entities.Goons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.tutorial.entities.map.*;


public class Goon extends DynamicSpriteEntity implements Collided {


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
}
