package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;


public class goLeft extends Directionaltile implements Collider{

    public goLeft(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.left.png", initialLocation, size);
    }

}
