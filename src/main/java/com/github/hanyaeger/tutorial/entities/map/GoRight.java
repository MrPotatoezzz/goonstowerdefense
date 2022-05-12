package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;

public class GoRight extends DirectionalTile {

    public GoRight(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.right.png", initialLocation, size);
        System.out.println(initialLocation);
    }

    @Override
    public Direction getNewDirection() {

        return Direction.RIGHT;
    }

    @Override
    public AnchorPoint getAnchorpoint() {
        return getAnchorPoint();
    }
}
