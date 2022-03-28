package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;

public class goRight extends DirectionalTile {

    public goRight(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.right.png", initialLocation, size);
    }

    @Override
    public Direction getDirection() {
        return Direction.RIGHT;
    }

    @Override
    public AnchorPoint getAnchorpoint() {
        return getAnchorPoint();
    }
}
