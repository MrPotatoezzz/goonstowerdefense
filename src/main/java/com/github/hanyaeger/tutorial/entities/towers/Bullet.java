package com.github.hanyaeger.tutorial.entities.towers;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;

public class Bullet extends DynamicSpriteEntity implements Collided, Collider, SceneBorderCrossingWatcher {

    public Bullet(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
        setSpeed(5);
        Direction();
        System.out.println("er is een bullet gespawned");
    }

    public void Direction(){
        if(getLocationInScene().getY() >= getSceneHeight() / 2){
            setDirection(Direction.UP);
        } else{
            setDirection(Direction.DOWN);
        }
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof Goon){
            this.remove();
        }
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        this.remove();
        System.out.println("bullet be gone");
    }
}
