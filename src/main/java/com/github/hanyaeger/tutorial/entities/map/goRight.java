package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class goRight extends Directionaltile implements Collider {

    public goRight(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.right.png", initialLocation, size);
    }

}
