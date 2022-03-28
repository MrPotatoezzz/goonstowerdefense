package com.github.hanyaeger.tutorial.entities.towers;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;

public class Bullet extends DynamicSpriteEntity implements Collided, Collider {

    public Goon goon;
    public Bullet(String resource, Coordinate2D initialLocation, Goon goon) {
        super(resource, initialLocation);
        setSpeed(5);
        Direction();
        this.goon = goon;
        System.out.println("er is een bullet gespawned");
    }

    public void Direction(){
        setDirection(Direction.UP);
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof Goon){
            this.remove();
        }
    }
}
