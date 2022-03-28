package com.github.hanyaeger.tutorial.entities.towers;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.scenes.Map1;


public class Tower extends SpriteEntity implements Collider {

private Goon goon;
private Map1 level;

    public Tower(Coordinate2D initialLocation, Goon goon, Map1 level) {
        super("sprites/tower.png", initialLocation);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }

    @Override
    public Coordinate2D getLocationInScene() {
        return super.getLocationInScene();
    }
}
