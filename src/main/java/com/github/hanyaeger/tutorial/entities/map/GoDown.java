package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;


public class GoDown extends DirectionalTile {

    public GoDown(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.down.png", initialLocation, size);
    }

    @Override
    public Direction getDirection() {
        return Direction.DOWN;
    }

    @Override
    public AnchorPoint getAnchorpoint() {
        return getAnchorPoint();
    }
}
