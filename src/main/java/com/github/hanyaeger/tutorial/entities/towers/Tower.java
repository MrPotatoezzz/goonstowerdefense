package com.github.hanyaeger.tutorial.entities.towers;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;


public class Tower extends SpriteEntity {
  private double x = getAnchorLocation().getX() - 15;
  private double y = getAnchorLocation().getY() - 15;

    public Tower(Coordinate2D initialLocation) {
        super("sprites/devIcon.png", initialLocation);
        setAnchorLocation(new Coordinate2D(x, y));
    }

}
