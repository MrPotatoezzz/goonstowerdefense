package com.github.hanyaeger.tutorial.entities.towers;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.scenes.Level;


public class Tower extends SpriteEntity implements Collider {

private Level level;

    public Tower(Coordinate2D initialLocation, Level level) {
        super("sprites/tower.png", initialLocation);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }

    @Override
    public Coordinate2D getLocationInScene() {
        return super.getLocationInScene();
    }
}
