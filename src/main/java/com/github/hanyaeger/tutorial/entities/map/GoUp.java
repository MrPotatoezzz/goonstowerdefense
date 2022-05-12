package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;


public class GoUp extends DirectionalTile{

    public GoUp(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.up.png", initialLocation, size);
    }


    @Override
    public Direction getNewDirection() {
        return Direction.UP;
    }

    @Override
    public AnchorPoint getAnchorpoint() {
        return getAnchorPoint();
    }
}
