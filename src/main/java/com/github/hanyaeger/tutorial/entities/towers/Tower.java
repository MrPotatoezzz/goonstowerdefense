package com.github.hanyaeger.tutorial.entities.towers;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;


public class Tower extends SpriteEntity implements Collider {

    public Tower(Coordinate2D initialLocation) {
        super("sprites/tower.png", initialLocation);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }
}
